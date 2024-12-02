package br.lpm;

import br.lpm.items.*;
import br.lpm.pedidos.Cliente;
import br.lpm.pedidos.EstadoPedido;
import br.lpm.pedidos.Pedido;

public class Main {
  public static void main(String args[]) {

    
    Pedido pedido = new Pedido(new Boi("Ramen Boi", Tamanho.GRANDE));
    pedido.adicionarAcrescimo("Chili");
    
    Cliente cliente1 = new Cliente("João");
    Cliente cliente2 = new Cliente("Maria");

    pedido.addObserver(cliente1);
    pedido.addObserver(cliente2);

    pedido.setEstado(EstadoPedido.PRONTO);

    pedido.setEstado(EstadoPedido.RETIRADO);
  }

}
