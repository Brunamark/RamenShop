package br.lpm;

import br.lpm.Excecao.AdcionarAcrescimoErrado;
import br.lpm.Excecao.AdicionarAscrecimoNulo;
import br.lpm.Excecao.QuantidadeZero;
import br.lpm.items.*;
import br.lpm.pedidos.Balanco;
import br.lpm.pedidos.Cliente;
import br.lpm.pedidos.EstadoPedido;
import br.lpm.pedidos.Pedido;

public class Main {
  public static void main(String args[]) {

    try{
      Pedido pedido = new Pedido(new Boi("Ramen Boi", Tamanho.GRANDE));
      pedido.adicionarAcrescimo("crouton");
      
      Cliente cliente1 = new Cliente("João");
      Cliente cliente2 = new Cliente("Maria");
  
      pedido.addObserver(cliente1);
      pedido.addObserver(cliente2);
  
      pedido.setEstado(EstadoPedido.PRONTO);
  
      pedido.setEstado(EstadoPedido.RETIRADO);

      Balanco balanco = Balanco.getInstance();

      double receitaTotal = balanco.getReceitaTotal();
      double ticketMedio = balanco.getTicketMedio();

      System.out.println("A receita total é: "+ receitaTotal);
      System.out.println("O ticket médio é: "+ ticketMedio);
    }catch(AdicionarAscrecimoNulo e){
      System.out.println(e.getMessage());
    }catch(AdcionarAcrescimoErrado e){
      System.out.println(e.getMessage());
    }catch(QuantidadeZero e){
      System.out.println(e.getMessage());
    }
    
  }

}
