package Cadastros;

public class Pessoa {
	
	String nome;
	String email;
	float rendimento;
	float totalPagar;
	
	Pessoa(String nome, String email, float rendimento, float totalPagar)
	{
		this.nome = nome;
		this.email = email;
		this.rendimento = rendimento;
		this.totalPagar = totalPagar;
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
	
	
	public float getTotalPagar() {
		return totalPagar;
	}

	public String toString()
	{
		String info = "";
		info += "Nome: " + nome + '\n';
		info += "Email: " + email + '\n';
		info += "Rendimento: " + rendimento + '\n';
		info += "Total a Pagar: " + totalPagar + '\n';
		return info;
		
	}

}
