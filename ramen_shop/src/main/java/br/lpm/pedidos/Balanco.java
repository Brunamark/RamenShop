package br.lpm.pedidos;

import java.util.Collections;
import java.util.List;
import br.lpm.Excecao.QuantidadeZero;

public class Balanco {
    private static final Balanco instance = new Balanco();
    private List<Pedido> pedidos;
    private Balanco(){
        ListaDePedidos listaDePedidos = ListaDePedidos.getInstance();
        pedidos = listaDePedidos.getPedidos();
    }

    public static Balanco getInstance(){
        return instance;
        
    }

    public List<Pedido> getPedidos(){
        for(Pedido pedido : pedidos){
            if(pedido.getEstado().equals(EstadoPedido.RETIRADO)){
                return pedidos;
            }
        }
        return Collections.emptyList();
    }

    public int getQuantidade(){
        return pedidos.stream() 
            .map(value -> 1)
            .reduce(0,(acc, e) -> acc+e);
    }

    public double getReceitaTotal(){
        return pedidos.stream()
            .map(pedido -> pedido.getPrecoTotal())
            .reduce(0.0,(acc,e)-> acc+e);
    }

    public double getTicketMedio() throws QuantidadeZero{
        int quantidade = getQuantidade();
        double receitaTotal = getReceitaTotal();
        
        if (quantidade == 0) {
            throw new QuantidadeZero();
        }
        
        return receitaTotal / quantidade;
    }

}
