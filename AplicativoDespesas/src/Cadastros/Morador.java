//import java.util.LinkedList;
//import java.util.List;


public class Morador {
	private String nome;
	private String email;
	private float rendimentos;
	
	
	
	
	public Morador(String nome, String email, float rendimentos) {
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
	}
	
	public String toString() {
		String descricao = "";
		descricao += "Morador: " + this.nome + '\n';
		descricao += "Email: " + this.email + '\n';
		descricao += "Rendimento: " + this.rendimentos + '\n';
		descricao += "*************";
		return descricao;
}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public double getRendimentos() {
		return rendimentos;
	}


	/*public List<Morador> getListaMorador() {
		return ListaMorador;
	}


	public void setListaMorador(List<Morador> listaMorador) {
		ListaMorador = listaMorador;
	}	
	
	public void addMorador(Morador M)
	{
		ListaMorador.add(M);
	}*/

}
