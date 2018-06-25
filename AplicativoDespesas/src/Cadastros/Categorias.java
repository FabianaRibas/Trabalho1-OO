package Cadastros;

public class Categorias {

	String descricao;
	String subcategoria;
	
	Categorias (String descricao, String subcategoria)
	{
		this.descricao = descricao;
		this.subcategoria = subcategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSubcategoria() {
		return subcategoria;
	}
	
	public String toString()
	{
		String info = "";
		info += "Categoria: " + descricao + '\n';
		info += "Subcategoria: " + subcategoria + '\n';
		return info;
	}

	public Categorias() {
		super();
	}
	
	
}
