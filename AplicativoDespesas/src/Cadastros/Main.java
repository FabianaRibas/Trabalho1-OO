import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
			opcao();
		}catch (Exception e) {
			opcao();
		}

	}
	
	public static void opcao() throws IOException {
		int opcao = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		ArrayList<Categorias> categorias = new ArrayList<Categorias>();
		@SuppressWarnings("unused")
		ArrayList<Despesas> despesas = new ArrayList<Despesas>();
		do {	
			System.out.print( "\n1. Cadastrar Pessoas.\n"
							+ "2. Cadastro das despesas.\n"
							+ "3. Cadastro das Categorias.\n"
							+ "4. Salvar contatos no Arquivo Txt.\n"
							+ "5. Excluir contatos.\n"
							+ "6. Ler contatos salvos na maquina.\n"
							+ "7. Consultar contribuicao da Republica.\n"
							+ "8. Sair.\n"
							+ "Escolha: ");
			opcao = input.nextInt();
			switch(opcao){
				case 1:
					input = new Scanner(System.in);
					System.out.print("Digite o nome da pessoa: ");
					String nome = input.nextLine();
					System.out.print("Digite o Email da pessoa: ");
					String email = input.nextLine();
					System.out.print("Digite o total dos Redimentos: ");
					double valor = input.nextDouble();
					if(nome != null && email != null && valor != 0) {
						Pessoa pessoa = new Pessoa(nome, email, valor);
						pessoas.add(pessoa);
							
					}	else {
						System.out.println("Voc� deve inserir todos os dados corretamentes!");
					}
					break;
				case 2:
					if(categorias.isEmpty()) {
						System.out.println("Voc� deve cadastrar ao menos um categoria para as despesas");
					} else {
						System.out.println("Selecione a categoria desejada");
						for (int i = 0; i < categorias.size(); i++) {
							if(categorias.get(i).checkIfVazia()) {
								System.out.printf("%d. Categoria: %s\n", i ,categorias.get(i).getNome());
							} else {
								for (int j = 0; j < categorias.get(i).getSubCategoria().size(); j++) {
									System.out.printf("%d. Categoria: %s, SubCategoria: %s", j, categorias.get(i).getNome(), categorias.get(j));	
								}
								
							}
						}
						System.out.print("Escolha: ");
						int escolhaCategoria = input.nextInt();
						System.out.print("Digite a descricao da despesa: ");
						String descricao = input.nextLine();
						System.out.print("Digite o valor da despesa: ");
						double valorDespesa = input.nextDouble();
						Despesas desp = new Despesas(descricao,categorias.get(escolhaCategoria),valorDespesa); 
					}
					break;
				case 3:
					input = new Scanner(System.in);
					System.out.print("Digite o nome da categoria: ");
					String categoria = input.nextLine();
					System.out.print("Deseja incluir uma subcategoria\n 1. Sim\n2. Nao\n Escolha: ");
					int escolha = input.nextInt();
					switch(escolha) {
					case 1:
						System.out.print("Digiete a descricao da sub categoria: ");
						String subCategoria = input.nextLine();
						Categorias categoriaSubcategoria = new Categorias(categoria, subCategoria);
						categorias.add(categoriaSubcategoria);
						System.out.println("Categoria cadastrada com sucesso.");
						break;
					case 2:
						Categorias c = new Categorias(categoria);
						categorias.add(c);
						System.out.println("Categoria incluida com sucesso.");
						break;
					default:
						System.out.println("Invalido! Nao foi possivel incluir uma categoria");
						break;
					}
					break;
				/*case 4:
					FileWriter arq = new FileWriter("P:\\agenda.txt");
					PrintWriter gravarArq = new PrintWriter(arq);
					gravarArq.printf(lista.exibirNo());	
					arq.close();
					System.out.println("Arquivo salvo com sucesso!");
					break;
				case 5:
					No temp = lista.primeiro;
					while (lista.getTotalNos() > 0 ) {
						lista.excluirNo(temp);
						if(lista.checkIfListaVazia() == false) {
							temp = lista.primeiro.prox;	
						} else {
							break;
						}
						
					}
					System.out.println("Lista excluida com sucesso");
					break;
				case 6:
					FileReader arqLer = new FileReader("P:\\agenda.txt");
				    BufferedReader lerArq = new BufferedReader(arqLer);
					String linha = lerArq.readLine();
					while(linha != null) {
						System.out.println(linha);
						linha = lerArq.readLine();
					}
					break;*/
				/*case 7:
					System.out.print("Visualizar\n1. Contribuicao Proporcional\n2. Contribuicao Igualitaria\n Escolha: ");
					int escolha1 = input.nextInt();
					System.out.println("Contribuição por morador!\n");
					switch(escolha1){
					case 1:
						float calcularContribuicaoProporcional()
					{
						//exemplo:
						/*José → R$1000,00 → 48%
						João → R$ 500,00 → 23,6%
						Pedro → R$ 600,00 → 28,4%
						Total → R$2100,00 → 100%
						
						return 0;
						
					}
					case 2:
					float calcularContribuicaoIgualitaria()
					{
						pessoas.size();
						
						return totalDeDespesas;
					}					
					break;
					}*/
				/*case 8:
					break;
				default:
					System.out.println("Op��o invalida, por favor, selecione uma op��o valida!");
				}*/
		
		
			}}while (opcao != 7);
	
		}}
