package agencia;

public class Corrente extends Conta {

    public Corrente(String nome) {
        this.setId(nextId);
        nextId++;
        this.setNome(nome);
        this.setSaldo(getSaldo());
        this.setTipo("CC");


    }
}
