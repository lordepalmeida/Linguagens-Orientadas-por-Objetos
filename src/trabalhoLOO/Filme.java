package trabalhoLOO;

public class Filme {
	private String filme = "Não definido";
	private int duracao = 0;
	
	public String getFilme() {return this.filme;}
	public int getDuracao() {return this.duracao;}
		
	public Filme(String filme, int duracao) {
		this.filme = filme;
		this.duracao = duracao;
	}
	
	public String toString() {
		return "Filme [filme=" + this.filme + ", duracao=" + this.duracao + "]";
	}
	
	
}
