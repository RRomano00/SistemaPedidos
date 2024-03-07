public class Main {
    public static void main(String[] args) {
        // Cadastro de pratos
        Prato prato1 = new Prato("Lasanha Bolonhesa", "Lasanha deliciosa",1,50.0);
        Prato prato2 = new Prato("Ravioli 4 Queijos","Acompanha fritas e salada", 2, 85.0 );


        System.out.println(prato1.obterDescricaoCompleta());
        System.out.println(prato2.obterDescricaoCompleta());

        //Criacao do Pedido
        //Pedido sem cupom
        Pedidos pedido1 = new Pedidos(1, "José", prato1, 3);

        //Pedido com cupom
        Pedidos pedido2 = new Pedidos(2, "Maria", prato2, 2);
        pedido2.setCupom("OFERTA15");

        //Calcular valor dos pedidos
        System.out.println("Pedido 1: " + pedido1.calcularValor());
        System.out.println("Pedido 2: " + pedido2.calcularValor());

        // Exibir extrado do pedido
        System.out.println("");
        System.out.println("Extrato pedido 1: " + pedido1.obterExtrato());
        System.out.println("Extrato pedido 2: " + pedido2.obterExtrato());

    }
}