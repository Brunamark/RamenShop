package br.lpm.business;

import java.util.LinkedList;
import java.util.Queue;

public class ListaEspera {
    private static ListaEspera uniqueLista = new ListaEspera();
    Queue<String> pedidos;


    private ListaEspera(){
         pedidos = new LinkedList<>();
    }

    public static ListaEspera getUniqueLista(){
        return uniqueLista;
    }

    public void adicionarPedido(String pedido){
        this.pedidos.add(pedido);
    }

    public Queue<String> getPedidos(){
        if(pedidos.isEmpty()){
            return null;
        }
        return this.pedidos;
    }
    
    public String removePedido(){
        if(pedidos.isEmpty()){
            return null;
        }
        return this.pedidos.poll();

    }
}
