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

    public void setCupom(String cupom){
        this.cupom = cupom;
    }

    public double calcularValor(){
        double valorPedido;
        valorPedido = (prato.getPreco()*this.quantidade)- this.obterDescontoCupom();

        return valorPedido;
    }

    private double obterDescontoCupom(){
        double desconto;
        switch(this.cupom){
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
}
