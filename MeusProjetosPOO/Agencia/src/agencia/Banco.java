package agencia;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;

    public Banco() {
        clientes = new ArrayList<Cliente>();
        contas = new ArrayList<Conta>();

    }

    public void addCliente(String nome) {
        for (Cliente conta : clientes) {
            if (conta.getNome().equals(nome)) {
                System.out.println("Já existe cliente com mesmo nome.");
                return;
            }
        }
        Cliente cliente = new Cliente(nome);
        Conta cc = new Corrente(nome);
        Conta cp = new Poupança(nome);
        this.clientes.add(cliente);
        cliente.addConta(cc);
        cliente.addConta(cp);
        this.contas.add(cc);
        this.contas.add(cp);
    }
    
    
    
    public void depositar(int n, double valor){
        for (Conta conta : contas){
            if(n == conta.getId()){
                conta.setSaldo(conta.getSaldo()+valor);
                return;
            }
        }
        System.out.println("Conta Não Encontrada");
    }
    
    public boolean sacar(int n, double valor){
        for (Conta conta : contas){
            if(valor <= conta.getSaldo() && n == conta.getId()){
                conta.setSaldo(conta.getSaldo()-valor);
                return true;
            }
            else if(valor > conta.getSaldo() && n == conta.getId()){
                System.out.println("Saldo Insuficiente!");
                return false;
            }
        }
        System.out.println("Conta Não Encontrada");
        return false;
    }
    
    public void tranferir(int n1, int n2, double valor){
        if(this.sacar(n1, valor)){
            this.depositar(n2, valor);
        }
    }
    
    public void status() {
        for (Conta conta : contas) {
            System.out.println(conta.getId() + ":" + conta.getNome() + ":" + conta.getSaldo() + ":" + conta.getTipo());
        }
    }
    
    public void update(){
        for (Conta conta : contas){
            if(conta.getTipo().equals("CC")){
                conta.setSaldo(conta.getSaldo()-20);
            }
            else{
                conta.setSaldo(conta.getSaldo()+(conta.getSaldo()*0.01));
            }
        }
    }
}
