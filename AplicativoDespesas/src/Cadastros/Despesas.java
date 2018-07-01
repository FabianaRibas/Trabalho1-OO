

public class Despesas {
	
	//private Categorias categoria;
	private String descricao;
	private float valor;
		
	public Despesas(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;
	}


	/*public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public Categorias getCategoria() {
		return categoria;
	}*/

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}


}
