import java.util.LinkedList;
import java.util.List;

public class CadastroDespesa {
	
		List<Despesas>ListaDespesas;
	
	public CadastroDespesa() {
		ListaDespesas = new LinkedList<Despesas>();
	}
	
	public boolean cadastrarDespesa(Despesas D) 
	{
		boolean resposta = false;
		if (ListaDespesas == null) 
			ListaDespesas = new LinkedList<Despesas>();
		resposta = ListaDespesas.add(D);
		return resposta;
	}


}
