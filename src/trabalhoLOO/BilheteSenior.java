package trabalhoLOO;

public class BilheteSenior extends Bilhete {
	
private double preco;
	
	public BilheteSenior(Sessao sessao, int fila, int lugarFila) {
		super(sessao, fila, lugarFila);
		this.preco = Bilhete.PRECOBASE - 1;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}	
}



