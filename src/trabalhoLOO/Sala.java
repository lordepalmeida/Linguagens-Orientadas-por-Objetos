package trabalhoLOO;

public class Sala {
	private String nomeSala;
	private int filas;
	private int lugaresFila;
	private String[][] lugar;
	private int capacidade;
	private Filme filme;
	
	public Sala(String nomeSala, int filas, int lugaresFila) {
		this.nomeSala = nomeSala;
		this.filas = filas;
		this.lugaresFila = lugaresFila;
		this.gerarLugares(this.filas, this.lugaresFila);
		this.capacidade = this.filas * this.lugaresFila;
		this.lugar = new String[this.filas+1][this.lugaresFila+1];
	}

	public Sala(String nomeSala, int filas, int lugaresFila,  Filme filme) {
		//this(nomeSala, filas, lugaresFila);
		this.nomeSala = nomeSala;
		this.filas = filas;
		this.lugaresFila = lugaresFila;
		this.filme = filme;
		this.gerarLugares(this.filas, this.lugaresFila);
		this.capacidade = this.filas * this.lugaresFila;
	}
	
	public String getNomeSala() { return this.nomeSala; }
	public int getFilas() { return this.filas; }
	public int getLugaresFila() { return this.lugaresFila; }
	public int getCapacidade() { return this.capacidade; }
	public Filme getFilme() { return this.filme; }

	public void definirFilme(Filme filme) {
		this.filme = filme;
	}
	
	public void gerarLugares(int filas, int lugaresFila) {
		for(int i = 1; i <= filas; i++) {
			for(int j = 1; j <= lugaresFila; j++)
				lugar[i][j] = "Lugar [Fila=" + i + ", cadeira=" + j + "]";
		}
	}
	
	public String toString() {
		return "Sala [nomeSala=" + this.nomeSala + ", filas=" + this.filas + ", lugaresFila=" + this.lugaresFila + ", capacidade=" + this.capacidade + ", filme=" + this.filme + "]";
	}
}
