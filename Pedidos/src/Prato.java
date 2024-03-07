public class Prato {
    private String nome;
    private String descricao;
    private int codigo;
    private double preco;

    public Prato(String nome, String descricao, int codigo, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String obterDescricaoCompleta(){
        String descricaoCompleta = "Código: " + this.codigo + "\n" + "Nome: " + this.nome + "\n" + "Descrição: " + this.descricao +
                "\n" +"Preço: " + this.preco + "\n";

        return descricaoCompleta;
    }

    public double getPreco() {
        return preco;
    }
    public String getNome(){
        return nome;
    }
}