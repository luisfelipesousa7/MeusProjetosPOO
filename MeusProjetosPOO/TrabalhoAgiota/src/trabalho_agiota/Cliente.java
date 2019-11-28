package trabalho_agiota;

public class Cliente {
	protected String apelido;
    protected String nome;
    protected double valorDivida;
    
    public Cliente(String apelido, String nome) {
        this.apelido = apelido;
        this.nome = nome;
        this.valorDivida = 0.0;
    }
    
    public String getApelido() {
        return this.apelido;
    }
    
    public double getValorDivida() {
        return this.valorDivida;
    }
    
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.apelido) + " : " + this.nome + " : " + this.valorDivida;
    }
}
