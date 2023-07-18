package application;


import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto: ");
        System.out.println("Nome:");
        product.setNome(sc.nextLine());
        System.out.println("Preço: ");
        product.setPreco(sc.nextDouble());
        System.out.println("quantidade");
        product.setQuantidade(sc.nextInt());

        System.out.println(product);
        





    }
}
