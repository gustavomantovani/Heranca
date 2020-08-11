package heranca;

public class Conta {

    protected  String nome;
    protected String cpf;
    protected String numeroConta;
    protected double saldo;
    
    public Conta(String nome, String cpf, String numeroConta, double saldo) {
      
        this.nome = nome;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
      
    }
    
    public double depositar(double quant) {
      
        saldo += quant;
        return saldo;
      
    }
    
    public double sacar(double quant) {
      
        saldo -= quant;
        return saldo;
      
    }
    
    public void imprimirSaldo() {
      
        System.out.println("Saldo atual: " + saldo);
      
    }

}
