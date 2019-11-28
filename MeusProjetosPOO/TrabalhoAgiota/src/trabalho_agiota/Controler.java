package trabalho_agiota;

public class Controler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agiota agiota = new Agiota(1000.0);
        agiota.addCliente("luis", "luis felipe");
        agiota.addCliente("luis", "luis felipe");
        agiota.emprestar("luis", 100.0);
        agiota.emprestar("luis", 200.0);
        agiota.addCliente("david", "david sena");
        agiota.emprestar("david", 200.0);
        agiota.emprestar("david", 500.0);
        agiota.receber("david", 600.0);
        agiota.historico();
        agiota.resumo();
        agiota.filtrar("david");
        agiota.matar("luis");
        agiota.resumo();
	}
}
