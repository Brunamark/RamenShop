package br.lpm.pedidos;

import java.util.ArrayList;
import java.util.List;
import br.lpm.Excecao.PedidoNulo;

public class ListaDePedidos {

    private static final ListaDePedidos instance = new ListaDePedidos();
    private List<Pedido> pedidos;

    private ListaDePedidos() {
        this.pedidos = new ArrayList<>();
    }


    public static ListaDePedidos getInstance() {
        return instance;
    }

    public void adicionarPedido(Pedido pedido) throws PedidoNulo {
        if(pedido == null){
            throw new PedidoNulo();
        }
        this.pedidos.add(pedido);

    }

    public List<Pedido> getPedidos() {
        return  pedidos != null ? pedidos : null;
    }





}
