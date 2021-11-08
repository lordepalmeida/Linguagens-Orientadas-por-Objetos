package trabalhoLOO;

public class BilheteNormal extends Bilhete {
	
	private double preco;
	
	public BilheteNormal(Sessao sessao, int fila, int lugarFila) {
		super(sessao, fila, lugarFila);
		this.preco = Bilhete.PRECOBASE;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}	
}
