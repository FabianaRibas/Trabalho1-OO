
public class Pessoa {
	private String nome;
	private String email;
	private double rendimentos;
	
	public Pessoa(String nome, String email, double rendimentos) {
		this.nome = nome;
		this.email = email;
		this.rendimentos = rendimentos;
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
	
}
