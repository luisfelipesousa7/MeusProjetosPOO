package agencia;

public class Poupan�a extends Conta {

    public Poupan�a(String nome) {
        this.setId(nextId);
        nextId++;
        this.setNome(nome);
        this.setSaldo(getSaldo());
        this.setTipo("CP");

    }

}
