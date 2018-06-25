package Cadastros;

public class Pessoa {
	
	String nome;
	String email;
	float rendimento;
	
	Pessoa(String nome, String email, float rendimento)
	{
		this.nome = nome;
		this.email = email;
		this.rendimento = rendimento;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public float getRendimento() {
		return rendimento;
	}
	
	public String toString()
	{
		String info = "";
		info += "Nome: " + nome + '\n';
		info += "Email: " + email + '\n';
		info += "Rendimento: " + rendimento + '\n';
		return info;
		
	}

}
