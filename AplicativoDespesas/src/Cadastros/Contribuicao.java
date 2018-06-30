

public class Contribuicao extends Despesas{
	
	public Contribuicao(String descricao, Categorias categoria, double valor) {
		super(descricao, categoria, valor);
	}
	
	float totalDeDespesas;

	public float pegarTotalDeDespesas()
	{
		totalDeDespesas += super.getValor();
		
		return totalDeDespesas;}
	
}