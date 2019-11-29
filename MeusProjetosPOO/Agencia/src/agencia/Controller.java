package agencia;

public class Controller {

	public static void main(String[] args) {
	      Banco Inter = new Banco();
	        Inter.addCliente("Luis");
	        Inter.addCliente("Davi");
	        Inter.status();
	        Inter.depositar(1, 6000);
	        Inter.status();
	        Inter.tranferir(1, 3, 1500);
	        Inter.sacar(1, 3000);
	        Inter.status();
	    }
	}
