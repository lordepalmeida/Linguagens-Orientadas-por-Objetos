package trabalhoLOO;

public class BilheteCrianca extends Bilhete{
	
	private double preco;
	
	public BilheteCrianca(Sessao sessao, int fila, int lugarFila) {
		super(sessao,fila,lugarFila);
		this.preco = Bilhete.PRECOBASE - 2.5;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}
}
