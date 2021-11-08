package trabalhoLOO;

public class Test {

	public static void main(String[] args) {
		Filme filme1 = new Filme("A Familia Addams", 86);
		Sala sala1 = new Sala("sala1", 5, 10, filme1);
		Sessao s1 = new Sessao("20:30", sala1);
		System.out.println(s1.toString());

		s1.lugaresLivres();
		s1.lugaresOcupados();
	}

}
