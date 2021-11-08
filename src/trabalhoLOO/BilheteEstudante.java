package trabalhoLOO;

public class BilheteEstudante extends Bilhete{

private double preco;
	
	public BilheteEstudante(Sessao sessao, int fila, int lugarFila, int idade) {
		super(sessao, fila, lugarFila);
		this.preco = Bilhete.PRECOBASE - 2;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return this.preco;
	}	
}
