package trabalhoLOO;

public class Sessao {
	private Sala sala;
	private Filme filme;
	private String horaInicio;
	private int duracao;
	private String[] intervaloDuracao;
	private int lugaresOcupados = 0;
	private int lugaresLivres;
	private boolean[][] ocupado;
	private boolean sessaoEsgotada;
	
	public Sessao(String horaInicio, Sala sala) {
		this.sala = sala;
		this.horaInicio = horaInicio;
		this.duracao = filme.getDuracao() + 20;
		this.intervaloDuracao = gerarIntervaloDuracao();
		this.ocupado = new boolean[sala.getFilas()+1][sala.getLugaresFila()+1];
		this.lugaresLivres = this.sala.getCapacidade();
	}
	
	public int getLugaresOcupados() {return this.lugaresOcupados;}
	public String getHoraInicio() {return this.horaInicio;}
	public boolean isSessaoCheia() {return this.sessaoEsgotada;}
	public int getLugaresLivres() {return this.lugaresLivres;}
	
	public String[] gerarIntervaloDuracao() {
		String[] horas = this.horaInicio.split(":");
		int hora = Integer.parseInt(horas[0]);
		int minutos = Integer.parseInt(horas[1]);
		String[] intervalo = new String[this.duracao+1];
		for(int i = 0; i <= this.duracao; i++) {
			if(minutos>9)
				intervalo[i] = "" + hora + ":" + "" + minutos;
			else
				intervalo[i] = "" + hora + ":" + "0" + minutos;
			System.out.println(intervalo[i]);
			if(minutos<59)
				minutos++;
			else {
				minutos = 0;
				hora++;
			}
		}
		return intervalo;
	}
	
	public void ocuparLugar(int fila, int lugarFila) {
		this.ocupado[fila][lugarFila] = true;
		this.lugaresOcupados += 1;			
		this.lugaresLivres -= 1;
	}
	
	public void venderBilhete(int fila, int lugarFila) {
		if(this.ocupado[fila][lugarFila] == false) {
			System.out.println("Bilhete vendido!");
			this.ocuparLugar(fila, lugarFila);
			this.definirSessaoEsgotada();
		}
		else
			System.out.println("Lugar ocupado!");
	}
	
	public void devolverBilhete(int fila, int lugarFila) {
		if(this.ocupado[fila][lugarFila] == true) {
			this.lugaresOcupados -= 1;
			this.lugaresLivres += 1;
			this.ocupado[fila][lugarFila] = false;
			System.out.println("Bilhete devolvido!");
		}
		else
			System.out.println("Bilhete inválido. Devolução não efetuada!");
	}
	
	public void lugaresLivres() {
		String[] lugaresVazios = new String[lugaresLivres];
		int k=0;
		for(int i = 1; i <= sala.getFilas(); i++) {
			for(int j = 1; j <= sala.getLugaresFila(); j++)
				if(this.ocupado[i][j] == false) {
					lugaresVazios[k] = "Lugar[Fila=" + i + ", cadeira=" + j + "]";
					k++;
				}
		}
		System.out.println("LUGARES LIVRES:");
		for(int i = 0; i < lugaresVazios.length; i++)
			System.out.println(lugaresVazios[i]);
	}
	
	public void lugaresOcupados() {
		String[] lugares = new String[lugaresOcupados];
		int k=0;
		for(int i = 1; i <= sala.getFilas(); i++) {
			for(int j = 1; j <= sala.getLugaresFila(); j++)
				if(this.ocupado[i][j] == true) {
					lugares[k] = "Lugar[Fila=" + i + ", cadeira=" + j + "]";
					k++;
				}
		}
		System.out.println("LUGARES OCUPADOS:");
		for(int i = 0; i < lugares.length; i++)
			System.out.println(lugares[i]);
	}

	public void definirSessaoEsgotada() {
		if(this.lugaresLivres == 0) {
			this.sessaoEsgotada = true;
			System.out.println("Neste momento a sessão está cheia");
		}
		else {
			this.sessaoEsgotada  = false;
		}
	}
	
	public String toString() {
		return "Sessao [lugaresOcupados=" + this.lugaresOcupados + ", lugaresVazios= " + this.lugaresLivres + ", horaInicio=" + this.horaInicio + ", duração=" + this.duracao + ", sessaoEsgotada="
				+ this.sessaoEsgotada + ", sala=" + this.sala.getNomeSala() + "]";
	}
}
