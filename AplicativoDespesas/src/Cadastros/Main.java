
import javax.swing.JOptionPane;

public class Main{
	
	static CadastroMorador m;
	static CadastroDespesa d;
	
	static final String opcoes[] = {
			
			"-- Escolha uma opcao --",
			"Cadastrar Morador(a)",
			"Cadastrar Despesa",
			"Cadastrar Categoria",
			"Pesquisar Morador(a)", 
			"Remover Morador(a)", 
			"Salvar Cadastros", 
			"Consultar Cadastros", 
			"Sair"
};
	
	public static void main(String[] args) {
		
		m = new CadastroMorador();
		d = new CadastroDespesa();
		
		Object opcao = JOptionPane.showInputDialog(null, "Escolha uma opcao", "Exemplo Persistencia", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		do {
			switch (opcao.toString()) 
			{
			case "Cadastrar Morador(a)":
				CadastrarMorador();
				break;
			case "Cadastrar Despesa":
				//CadastrarDespesa();
				break;
				
			case "Cadastrar Categoria":
				//CadastrarCategoria();
				break;
				
			case "Pesquisar Morador(a)": 
				PesquisarMorador();
				break;
			
			case "Remover Morador(a)":
				RemoverMorador();
				break;
			case "Salvar Cadastros":
				SalvarCadastros();
				break;
			case "Consultar Cadastros":
				ConsultarCadastros();
				break;				

			default:
				break;
			}
			
			opcao = JOptionPane.showInputDialog(null, "Escolha uma opcao", "Exemplo Persistencia", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			} while (!opcao.toString().equalsIgnoreCase(opcoes[8]));

	}

	private static void ConsultarCadastros() {
		boolean opcao; 
		opcao = m.ConsultarCadastrosNoArquivo();
		if (opcao)
			JOptionPane.showMessageDialog(null, "Consulta realizada com sucesso!");
		
	}

	private static void SalvarCadastros() 
	{
		boolean opcao = m.SalvarCadastrosEmArquivo();
		if (opcao) JOptionPane.showMessageDialog(null, "Cadastros salvos com sucesso!");
		
	}

	private static void RemoverMorador() 
	{
		Morador M = PesquisarMorador();
		if(M != null) 
		{
		int opcao = JOptionPane.showConfirmDialog(null,"Você tem certeza que deseja remover o(a) morador(a)?","Remover?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (opcao == JOptionPane.YES_OPTION)
		{
			boolean removido = m.RemoverMorador(M);
			
			if (removido) 
				JOptionPane.showMessageDialog(null, "Morador(a) removido com sucesso!");
		}
			else 
				JOptionPane.showMessageDialog(null, "Não foi possivel remover o(a) morador(a)!");
}
		
	}

	private static Morador PesquisarMorador() 
	{
		String nome = JOptionPane.showInputDialog("Qual eh o nome do morador(a)?");
		String email = JOptionPane.showInputDialog("Qual eh o email do morador(a)?");
		
		Morador M = m.pesquisarMorador(nome,email);
		if(M != null) 
		{
		JOptionPane.showMessageDialog(null, M);
		return M;
		}
		else
			JOptionPane.showMessageDialog(null, "Morador(a) não eh cadastrado(a) na Republica!");
		return null;
		
	}

	/*private static boolean CadastrarDespesa() {
				
		String repetir = "sim";
		do {
		//String categoria = JOptionPane.showInputDialog("Categoria da Despesa");
		String descricao = JOptionPane.showInputDialog("Descrição da Despesa");
		String valor = JOptionPane.showInputDialog("Valor da Despesa");
		
		float valores = Float.parseFloat(valor);
		
		Despesas D = new Despesas(descricao,valores);
		
		boolean resposta = d.cadastrarDespesa(D);
		
		if (resposta)
			JOptionPane.showMessageDialog(null, "Despesas cadastrada com sucesso!!");
		
		return resposta;
		
		String repetir = JOptionPane.showInputDialog("Deseja cadastrar outra despesa?");
		
		}while(repetir.equalsIgnoreCase("Sim"));
	}*/

	private static boolean CadastrarMorador() 
	{
			String nome = JOptionPane.showInputDialog("Nome do Morador(a)");
			String email = JOptionPane.showInputDialog("Email do Morador(a)");
			String rendimentos = JOptionPane.showInputDialog("Rendimento do Morador(a)");
			
			float rendimento = Float.parseFloat(rendimentos);
			
			Morador M = new Morador(nome, email, rendimento);
			
			boolean resposta = m.cadastrarMorador(M);
			
			if (resposta)
				JOptionPane.showMessageDialog(null, "Morador(a) cadastrado com sucesso!");
			return resposta;
	}
		
	}
