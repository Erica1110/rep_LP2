public class CadernetaPoupanca {
  private String titular;               
  private int diaAniversario;           
  private double depositoInicial;       
  private double rendimentoAcumulado;   

  public CadernetaPoupanca(String titular, int diaAniversario, double depositoInicial) {
     this.titular = titular;
     this.diaAniversario = diaAniversario;
     this.depositoInicial = depositoInicial;
     this.rendimentoAcumulado = 0;
  }

  public String getTitular() {
     return titular;
  }
  public int getDiaAniversario() {
     return diaAniversario;
  }
  public double getDepositoInicial() {
     return depositoInicial;
  }

  public double getRendimentoAcumulado() {
     return rendimentoAcumulado;
  }
  
  public void atualizarRendimento(double prTaxa) {
     double rendimento = (depositoInicial + rendimentoAcumulado) * prTaxa / 100;
     this.rendimentoAcumulado += rendimento;
  }
  
  
  public double getSaldo() {
     return this.depositoInicial + this.rendimentoAcumulado;
  }
  
  public double getTaxaRendimentoAcumulada() {
     return this.rendimentoAcumulado / getSaldo() * 100;
  }
  
}