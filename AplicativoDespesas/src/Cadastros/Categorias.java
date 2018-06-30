
import java.util.ArrayList;

public class Categorias {
	private String nome;
	private ArrayList<String> subCategoria = new ArrayList<String>();
	
	public Categorias(String nome) {
		this.nome = nome;
	}
	
	public Categorias(String nome, String nomeSubCategoria) {
		this.nome = nome;
		this.subCategoria.add(nomeSubCategoria);
	}
	
	public boolean checkIfVazia() {
		if(this.subCategoria.size() == 0)
			return true;
		else
			return false;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<String> getSubCategoria() {
		
		return subCategoria;
	}
	
	
}
