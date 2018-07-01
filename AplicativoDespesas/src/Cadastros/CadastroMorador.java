import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CadastroMorador {
	
	List<Morador>ListaMorador;
	
	public CadastroMorador() {
		ListaMorador = new LinkedList<Morador>();
	}
	
	public boolean cadastrarMorador(Morador M) 
	{
		boolean resposta = false;
		if (ListaMorador == null) 
			ListaMorador = new LinkedList<Morador>();
		resposta = ListaMorador.add(M);
		return resposta;
	}

	public Morador pesquisarMorador(String nome, String email)
	{
		Morador resposta = null;
		java.util.Iterator<Morador> pesquisa = ListaMorador.iterator();
		
		while (pesquisa.hasNext()) {
			Morador M = pesquisa.next();
			if (M.getNome().equalsIgnoreCase(nome) &&
				M.getEmail().equalsIgnoreCase(email)
					) 
				resposta = M;
		}
		return resposta;
	}

	public boolean RemoverMorador(Morador m) 
	{
		boolean opcao = false;
		if (ListaMorador.contains(m))
			opcao = ListaMorador.remove(m);
		return opcao;
	}


	public boolean SalvarCadastrosEmArquivo() 
	{
		boolean opcao = false;
		
		FileWriter arq = null;
		
		try 
		{
			arq = new FileWriter("Republica.txt");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		BufferedWriter buffer = new BufferedWriter(arq);
		
		java.util.Iterator<Morador> pesquisa = ListaMorador.iterator();
		
		while (pesquisa.hasNext()) 
		{
			Morador M = pesquisa.next();
			String str = "";
			str += M.getNome() + ";";
			str += M.getEmail() + ";";
			str += M.getRendimentos() + ";";
			//str += M.getAnoMod() + ";";
			
			try 
			{
				buffer.write(str);
				buffer.newLine();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
		try 
		{
			buffer.close();
			opcao = true;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return opcao;
	}

	public boolean ConsultarCadastrosNoArquivo() 
	{
		FileReader arq = null;
		BufferedReader buffer;
		boolean retorno; 
		
		try 
		{
			arq = new FileReader("Republica.txt");
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		buffer = new BufferedReader(arq);
		String line = "";
		
		try 
		{
			line = buffer.readLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		do 
		{
			String[] linha = line.split(";");
			
			float rendimento = Float.parseFloat(linha[2]);
			//int contribuicao = Integer.parseInt(linha[3]);
			
			Morador M = new Morador(linha[0], linha[1], rendimento);
			
			if (ListaMorador == null) 
				ListaMorador = new LinkedList<Morador>();
			
			retorno = ListaMorador.add(M);
			
			try 
			{
				line = buffer.readLine();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		} while (line != null);
		
		return retorno;
	}

}
