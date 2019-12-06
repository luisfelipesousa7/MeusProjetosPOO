package trabalho_topic;

import java.util.ArrayList;

public class Topic {
	ArrayList<Passageiro> poltronas;
	int vaga;
	int vagaP;
	int alocar = 2;
	int alocarP = 0;
	int idadeP = 60;
	int cont;

	public Topic(int vaga, int vagaP) {
		super();
		poltronas = new ArrayList<Passageiro>();
		for (int i = 0; i < vaga; i++)
			poltronas.add(null);
		this.vaga = vaga;
		this.vagaP = vagaP;
	}

	public void embarcar(Passageiro passageiro, int idade) {
		cont = 0;
		for (int i = 0; i < this.poltronas.size(); i++ ){
			if (poltronas.get(i) != null){
				cont ++;
			}
		}
		if (cont > this.poltronas.size()){
			System.out.println("Esta lotado.");
		}
		else if (idade >= 60){
			for (int i = 0; i < this.poltronas.size(); i++){
				if (this.poltronas.get(i) == null && i < 2){
					poltronas.set(i, passageiro);
					alocarP++;
					break;
				}
				else if(this.poltronas.get(i) == null && i > 2){
					poltronas.set(i, passageiro);
					alocar++;
					break;
				}
			}
		}
		else if (idade < 60){
			for (int i = 0; i < this.poltronas.size(); i++){
				if(this.poltronas.get(i) == null && i > 2){
					poltronas.set(i, passageiro);
					alocar++;
					break;
				} else if(this.poltronas.get(i) == null && i < 2){
					if (alocar >= 9 && alocarP < 2){
						poltronas.set(i, passageiro);
					break;
					}
				}
			}
		}
	}

	public void remover(String nome) {
		for (int i = 0; i < this.poltronas.size(); i++) {
			Passageiro passageiro = this.poltronas.get(i);
			if (passageiro != null && passageiro.getId().contentEquals(nome)) {
				if (passageiro.getIdade() > 60 && i < 2) {
					alocarP--;
				}

				else if (passageiro.getIdade() < 60 && i >= 2) {
					alocar--;
					System.out.println(alocar);
				} else if (passageiro.getIdade() > 60 && i >= 2) {
					alocar--;
					System.out.println(alocar);
				} else if (passageiro.getIdade() < 60 && i < 2) {
					alocarP--;
					System.out.println(alocarP);
				}
				this.poltronas.set(i, null);
			}
		}
	}

	@Override
	public String toString() {
		String inicio = "| ";
		for (int i = 0; i < poltronas.size(); i++) {
			if (i < vagaP) {
				if (poltronas.get(i) == null) {
					inicio += "@ ";
				} else if (poltronas.get(i) != null) {
					inicio += poltronas.get(i) + " ";
				}
			} else if (poltronas.get(i) != null) {
				inicio += poltronas.get(i) + " ";
			} else {
				inicio += "= ";
			}
		}
		inicio += "|";
		return inicio;
	}
}
