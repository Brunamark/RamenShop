package br.lpm.fabrica;

import java.util.LinkedList;
import java.util.Queue;
import br.lpm.items.MenuItem;

public class ListaEspera {
    private static ListaEspera uniqueLista = new ListaEspera();
    Queue<MenuItem> pedidos;


    private ListaEspera(){
         pedidos = new LinkedList<>();
    }

    public static ListaEspera getUniqueLista(){
        return uniqueLista;
    }

    public void adicionarPedido(MenuItem pedido){
        this.pedidos.add(pedido);
    }

    public Queue<MenuItem> getPedidos(){
        if(pedidos.isEmpty()){
            return null;
        }
        return this.pedidos;
    }
    
    public MenuItem removePedido(){
        if(pedidos.isEmpty()){
            return null;
        }
        return this.pedidos.poll();

    }
}
