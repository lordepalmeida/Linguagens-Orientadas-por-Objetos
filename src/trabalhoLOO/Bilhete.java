package trabalhoLOO;

public abstract class Bilhete {
	protected static final double PRECOBASE = 7;
	private Sessao sessao;

	
	public Bilhete(Sessao sessao, int fila, int lugarFila) {
		this.sessao = sessao;
		sessao.venderBilhete(fila, lugarFila);
	}
	
	public abstract double getPreco();
	
	public void devolverBilhete(int fila, int lugarFila) {
		sessao.devolverBilhete(fila, lugarFila);
	}	
}
