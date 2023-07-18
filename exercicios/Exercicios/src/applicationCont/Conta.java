

public class Conta {
    
    private int numeroConta;
    private String titularConta;
    private double saldoConta;
   
    public Conta(int numeroConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        
    }
    public Conta(int numeroConta, String titularConta, double valorInicial) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        depositar(valorInicial);
       
    }

    public void depositar(double montante){
          saldoConta += montante;

    }

    public void sacar(double montante){
        saldoConta -= montante;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTitularConta() {
        return titularConta;
    }
    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }
    public double getSaldoConta() {
        return saldoConta;
    }

    public String toString(){
        return " [Numero da conta: " +  numeroConta + "] [Cliente: " + titularConta + 
        "] [Saldo: R$" + String.format("%.2f",saldoConta) + "]";
    }

}

