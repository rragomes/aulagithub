import java.util.Scanner;
import java.util.Locale;


public class App1{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Conta conta = null;
    System.out.println("----------bem vindo-----------");
    boolean sair = false;
    while(!sair){
      System.out.println("-------------------------------------------------");
      System.out.println("1 - Criar conta e efetuar um deposito inicial");
      System.out.println("2 - Somente criar uma conta");
      System.out.println("3 - Visualizar dados e saldo");
      System.out.println("4 - depositar um valor");
      System.out.println("5 - sacar um valor");
      System.out.println("6 - Sair");
      int opcao = sc.nextInt();

      switch(opcao) {
         
        case 1:
        if (conta == null){
        System.out.println("Digite o numero da conta");
        int numeroConta = sc.nextInt();
        System.out.println("digite seu nome: ");
        sc.nextLine();
        String titularConta = sc.nextLine();
        System.out.println("digite o valor a ser depositado:");
        double valorInicial = sc.nextDouble();
        System.out.println("Você fez um deposito inicial de: R$" + valorInicial);
        conta = new Conta(numeroConta, titularConta, valorInicial);
        break;
        }else{
          System.out.println("sua conta ja existe");
        }
        case 2: 
        if (conta == null) {
        System.out.println("Digite o numero da conta");
        int numeroConta = sc.nextInt();
        System.out.println("digite seu nome: ");
        sc.nextLine();
        String titularConta = sc.nextLine();
        conta = new Conta(numeroConta, titularConta);
        System.out.println("Parabens!!!" +conta);
        break;
        } else {
          System.out.println("Você ja possui uma conta");
        }
        case 3:
        if (conta == null) {
         System.out.println("Crie uma conta e efetue um deposito para visualizar seus dados.");
         break; 
        } else {
         System.out.println(conta); 
         break;
        }
        case 4: 
        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("Você fez um deposito de: R$" +valor);
        System.out.println("Saldo atual: R$" + conta.getSaldoConta());
        break;
        case 5:
        System.out.println("Digite a quantidade para Sacar: ");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("Você fez um saque de :R$"+ valor);
        System.out.println("Seu saldo atual é :R$" + conta.getSaldoConta());
        break;
        case 6:
        System.out.println("Até mais...");
        System.exit(0);
        break;
        default:
        break;
        
      }  
    }
        sc.close();

}

}