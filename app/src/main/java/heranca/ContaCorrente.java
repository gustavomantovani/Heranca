package heranca;

public class ContaCorrente extends Conta {

    private double tarifaMensal;
    
    public ContaCorrente(String nome, String cpf, String numeroConta, double saldo) {
      
        super(nome, cpf, numeroConta, saldo);
      
    }
    
    public void setTarifaMensal(double tarifaMensal) {
      
        this.tarifaMensal = tarifaMensal;
      
    }

}
