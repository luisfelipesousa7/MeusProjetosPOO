package agencia;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Conta> contas;
    
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
    
    public Cliente(String nome) {
        this.nome = nome;
        contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
