package Cadastros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cadastro {
	
	List<Pessoa> pessoa;
	
	public Cadastro()
	{
		pessoa = new LinkedList<Pessoa> ();
	}
	
	public boolean cadastrarPessoa(Pessoa p)
	{
		boolean resposta = false;
		if (pessoa == null) 
			pessoa = new LinkedList<Pessoa>();
		resposta = pessoa.add(p);
		return resposta;
	}
	
	public Pessoa pesquisarPessoa(String nome, String email, float rendimento) 
	{
		Pessoa resposta = null;
		Iterator<Pessoa> it = pessoa.iterator();
		
		while (it.hasNext()) 
		{
			Pessoa p = it.next();
			if (p.getNome().equalsIgnoreCase(nome) && 
				p.getEmail().equalsIgnoreCase(email)) 
				resposta = p;
		}		
		return resposta;
	}
	
	public boolean removerPessoa(Pessoa p) 
	{
		boolean resposta = false;
		if (pessoa.contains(p))
			resposta = pessoa.remove(p);
		return resposta;
	}
	
	public boolean AdicionarPessoa()
	{
		boolean resposta = false;
		FileWriter arquivo = null;
		
		try 
		{
			arquivo = new FileWriter("alunos.txt");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		BufferedWriter buffer = new BufferedWriter(arquivo);
		
		Iterator<Pessoa> indv = pessoa.iterator();
		while (indv.hasNext()) 
		{
			Pessoa p = indv.next();
			String str = "";
			str += p.getNome() + ";";
			str += p.getEmail() + ";";
			str += p.getRendimento() + ";";
			//str += p.getTotalPagamento() + ";";
			
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
			resposta = true;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return resposta;
	}
	
	public boolean consultarPessoa() 
	{
		FileReader arquivo = null;
		BufferedReader buffer;
		boolean resposta; 
		
		try {
			arquivo = new FileReader("alunos.txt");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		buffer = new BufferedReader(arquivo);
		
		
		String line = "";
		try 
		{
			line = buffer.readLine();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		do {
			String[] celula = line.split(";");
			
			float rendimento = Float.parseFloat(celula[2]);
			float totalPagar = Float.parseFloat(celula[3]);
			
			Pessoa p = new Pessoa(celula[0], celula[1], rendimento, totalPagar);
			
			if (pessoa == null) 
				pessoa = new LinkedList<Pessoa>();
			
			resposta = pessoa.add(p);
			
			try 
			{
				line = buffer.readLine();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		} while (line != null);
		
		return resposta;
	}
	
	
	
	
}
