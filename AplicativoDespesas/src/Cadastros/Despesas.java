
public class Despesas {
	private Categorias categoria;
	private String descricao;
	private double valor;
	
	public Despesas(String descricao, Categorias categoria, double valor) {
		this.categoria = categoria;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
}
