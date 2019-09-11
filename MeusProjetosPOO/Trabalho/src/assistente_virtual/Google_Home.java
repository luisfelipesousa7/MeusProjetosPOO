package assistente_virtual;
import java.util.Scanner;
public class Google_Home {
	void voz(){
		if(ligado == true) {
			System.out.println("google: oi!");
			System.out.println("*lista de comandos: 'toque' uma música','aumente' ou 'diminua' o volume, 'proxima' música, música 'anterior' ... ou 'pare'");
		}else {
			System.out.println("...");
		}
	}
	int volume;
	int musica;
	boolean tocando = false;
	boolean ligado = false;
	void aumentar() {
		if(tocando == true && volume < 10) {
			volume++;
			System.out.println("google: certo!");
		}else {
			System.out.println("*peça que algo seja reproduzido para aumentar o volume*");
		}
	}
	void diminuir() {
		if(tocando == true && volume >0) {
			volume--;
			System.out.println("google: blz!");
		}else {
			System.out.println("*peça que algo seja reproduzido para diminuir o volume*");
		}
	}
	void tocarmus() {
		if(tocando == false) {
			tocando = true;
			System.out.println("google: ok!");
		}else {
			System.out.println("tente: 'ok google', logo em seguida 'tocar'.");
		}
	}
	void proxmus() {
		if(tocando == true) {
			musica++;
			System.out.println("google: tudo bem!");
		}else {
			System.out.println("*nenhuma musica sendo reproduzida no momento*");
		}
	}
	void antemus() {
		if(tocando == true) {
			musica--;
			System.out.println("google: certo");
		}else {
			System.out.println("*nenhuma musica sendo reproduzida no momento*");
		}
	}
	void estaLigado(){
		if(ligado == false) {
			ligado = true;
			System.out.println("pling!");
			System.out.println("*para começar, diga: ok google*");
		}else {
			System.out.println("*desligando*");
			ligado = false;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Google_Home alexa = new Google_Home();
		System.out.println("você precisa 'apertar' o botão para ligar ou desligar.");
		while(true) {
			String line = scanner.nextLine();
			if(line.equals("apertar"))
				alexa.estaLigado();					
			else if(line.equals("ok google"))
				alexa.voz();
			else if(line.equals("toque"))
				alexa.tocarmus();
			else if(line.equals("proxima"))
				alexa.proxmus();
			else if(line.equals("anterior"))
				alexa.antemus();
			else if(line.equals("aumente"))
				alexa.aumentar();
			else if(line.equals("diminua"))
				alexa.diminuir();
			else if(line.equals("pare"))
				alexa.tocarmus();
			else
				System.out.println("google: desculpe, não entendi.");
		}
	}
}
