package Cadastros;

public class Despesas extends Categorias {

	String descricaoDespesa;
	float valorDespesa;
	
	Despesas (String descricaoDespesa, float valorDespesa, String subcategoria, String descricao)
	{
		this.descricao = descricao;
		this.descricaoDespesa = descricaoDespesa;
		this.subcategoria = subcategoria;
		this.valorDespesa = valorDespesa;
		
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public float getValorDespesa() {
		return valorDespesa;
	}
	
	public String toString()
	{
		String info = "";
		info += "Descricao Despesa: " + descricaoDespesa + '\n';
		info += "valor da Despesa: " + valorDespesa + '\n';
		return info;
	}
	
	
	
}
