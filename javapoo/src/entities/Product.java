package entities;

public class Product{

    private String nome;
    private double preco;
    private int quantidade;
    
    public Product(){

    }

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
// logica do total de produtos 
    public double totalEstoque(){
        return preco * quantidade;
    }

    public void addProdt(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdt(int quantidade){
        this.quantidade -=quantidade;
    }
// formatação do print para aparecer de forma mais organizada na tela quando chamado no App.java
    public String toString(){
        return nome
        +", $"
        +String.format("%.2f",preco)
        +", "
        +quantidade
        +"unidade, Total: $"
        +String.format("%.2f",totalEstoque());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    



    

}