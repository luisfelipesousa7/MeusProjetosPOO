package trabalho_topic;

public class Controle {

	public static void main(String[] args) {
		Topic busao = new Topic(5, 2);
		System.out.println(busao);	
		busao.embarcar(new Passageiro("Felipe", 18, "N1"), 18);
		System.out.println(busao);
		busao.embarcar(new Passageiro("Davi", 70, "P2"), 70);
		System.out.println(busao);
		busao.embarcar(new Passageiro("Lais", 90, "P3"), 90);
		System.out.println(busao);
		busao.embarcar(new Passageiro("Clara", 16, "N4"), 16);
		System.out.println(busao);
		busao.embarcar(new Passageiro("Luiz", 65, "N5"), 65);
		busao.remover("Gil");
		busao.remover("Lais");
		System.out.println(busao);
	}
}
