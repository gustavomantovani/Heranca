package heranca;

public class Principal {

  public static void main(String[] args) {
  
      ContaPoupanca cp = new ContaPoupanca("Jonas", "321.654.987-90", "1", 2000);
      cp.setPercentualRendimento(11);
      cp.atualizarSaldo();
      cp.imprimirSaldo();
      cp.sacar(1000);
      cp.imprimirSaldo();
  
      ContaCorrente cc = new ContaCorrente("Gustavo", "123.456.789-09", "2", 4000);
      cc.setTarifaMensal(2);
      cc.depositar(500);
      cc.imprimirSaldo();
   
  }
}
