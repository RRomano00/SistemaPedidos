public class Pedidos {
    private int numero;
    private String nomeCliente;
    private Prato prato;
    private int quantidade;
    private String cupom;

    //Construtor
    public Pedidos(int numero, String nomeCliente, Prato prato, int quantidade) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.prato = prato;
        this.quantidade = quantidade;
        this.cupom = "";
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public double calcularValor() {
        double valorPedido;
        valorPedido = (prato.getPreco() * this.quantidade) - this.obterDescontoCupom();

        return valorPedido;
    }

    private double obterDescontoCupom() {
        double desconto;
        switch (this.cupom) {
            case "OFERTA10":
                desconto = 10.0;
                break;
            case "OFERTA15":
                desconto = 15.0;
                break;
            default:
                desconto = 0.0;
        }

        return desconto;
    }

    public String obterExtrato(){
        String extrato = "Número:" + this.numero + "\n" + "Cliente: " + this.nomeCliente + "\n" +"Nome prato: " + this.prato.getNome()
                + "\n" + "Valor unitário: "+ this.prato.getPreco() + "\n" + "Quantidade:" + this.quantidade + "\n" +
                "Desconto: " + this.obterDescontoCupom() + "\n" + "Valor final: " + this.calcularValor() + "\n";

        return extrato;
    }

    public void mostrarExtrato(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Prato:" + this.prato.getNome());
    }
}