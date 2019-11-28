package trabalho_agiota;

import java.util.ArrayList;

public class Agiota {
	protected double saldo;
	protected static int nextId;
	protected ArrayList<Cliente> clientes;
    protected ArrayList<Transacao> transacoes;
    
    public Agiota(double saldo) {
        this.clientes = new ArrayList<Cliente>();
        this.transacoes = new ArrayList<Transacao>();
        this.saldo = saldo;
        Agiota.nextId = 0;
        System.out.println("~Lista Ptonomeu~");
    }
    
    public boolean addCliente(String nome, String nomeC) {
        for (Cliente i : this.clientes) {
            if (i.getApelido().equals(nome)) {
                System.out.println("error: cliente já existe");
                return false;
            }
        }
        Cliente cliente = new Cliente(nome, nomeC);
        this.clientes.add(cliente);
        System.out.println("cliente adicionado");
        return true;
    }
    
    public boolean emprestar(String apelido, double valor) {
        if (this.saldo >= valor) {
            for (Cliente e : this.clientes) {
                if (e.getApelido().equals(apelido)) {
                    e.setValorDivida(e.getValorDivida() + valor);
                    this.saldo -= valor;
                    Transacao transacao = new Transacao(Agiota.nextId, apelido, valor * -1.0);
                    this.transacoes.add(transacao);
                    ++Agiota.nextId;
                    return true;
                }
            }
            System.out.println("Cliente não encontrado");
            return false;
        }
        System.out.println("error: saldo menor do que o valor");
        return false;
    }
    
    public void historico() {
        for (Transacao t : this.transacoes) {
            System.out.println(t);
        }
    }
    
    public void resumo() {
        for (Cliente c : this.clientes) {
            System.out.println(c);
        }
        System.out.println("Ptolomeu: " + this.saldo);
    }
    
    public void filtrar(String apelido) {
        for (Transacao t : this.transacoes) {
            if (t.getClienteId() == apelido) {
                System.out.println(t);
            }
        }
    }
    
    public void receber(String apelido, double valor) {
        for (Cliente c : this.clientes) {
            if (c.getApelido() == apelido) {
                c.setValorDivida(c.getValorDivida() - valor);
                this.saldo += valor;
                Transacao transacao = new Transacao(Agiota.nextId, apelido, valor);
                this.transacoes.add(transacao);
                ++Agiota.nextId;
            }
        }
        System.out.println("error: cliente não encontrado");
    }
    
    public void matar(String apelido) {
        for (Cliente c : this.clientes) {
            if (c.getApelido().equals(apelido)) {
            	this.clientes.remove(c);
                System.out.println(String.valueOf(apelido) + " pagou com a morte.");
            }
        }
    }
}