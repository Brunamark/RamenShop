package br.lpm.pedidos;

import br.lpm.items.Prato;

public class Pedido {

    private EstadoPedido estado;
    private static int counter = 0;
    private Long id;
    private Prato prato;


   public Pedido(Prato prato){
        this.id = (long) counter++;
        this.estado = EstadoPedido.PENDENTE;
        this.prato = prato;
   }
 
    public EstadoPedido getEstado(){
        return this.estado;
    }

    public void setEstado(EstadoPedido estadoPedido){
        this.estado = estadoPedido;
    }
    
    public Long getId() {
        return id;
    }
    
    public double getPrecoTotal() {
        return prato.getPreco();
    }
    
}
