package heranca;

public class ContaPoupanca extends Conta {

    private double percentualRendimento;
    
    public ContaPoupanca(String nome, String cpf, String numeroConta, double saldo) {
      
        super(nome, cpf, numeroConta, saldo);
      
    }
    
    public void setPercentualRendimento(double percentualRendimento) {
      
        this.percentualRendimento = percentualRendimento;
      
    }
    
    public double atualizarSaldo() {
      
        this.saldo += (saldo * percentualRendimento) / 100;
        return this.saldo;
      
    }

}
