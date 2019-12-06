package trabalho_topic;

public class Passageiro {
	private String id;
	private String passagem;
	private int idade;
				
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTicket() {
		return passagem;
	}

	public void setTicket(String ticket) {
		this.passagem = ticket;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Passageiro(String id, int idade, String ticket) {
		super();
		this.id = id;
		this.setIdade(idade);
		this.passagem = ticket;
	}

	public String toString() {
		return id + ": " + passagem;
	}
}