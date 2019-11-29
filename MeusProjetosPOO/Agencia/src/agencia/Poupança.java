package agencia;

public class Poupança extends Conta {

    public Poupança(String nome) {
        this.setId(nextId);
        nextId++;
        this.setNome(nome);
        this.setSaldo(getSaldo());
        this.setTipo("CP");

    }

}
