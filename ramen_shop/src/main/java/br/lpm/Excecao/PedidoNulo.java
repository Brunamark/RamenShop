package br.lpm.Excecao;

public class PedidoNulo extends Exception {
    public PedidoNulo(){
        super("Ao adicionar o pedido, o mesmo não deve ser vazio.");
    }
}
