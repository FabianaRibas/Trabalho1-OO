

public class Despesas {
	
	//private Categorias categoria;
	private String descricao;
	private float valor;
		
	public Despesas(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}


}
