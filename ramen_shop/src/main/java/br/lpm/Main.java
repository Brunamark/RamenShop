package br.lpm;

import java.util.Arrays;
import java.util.List;
import br.lpm.fabrica.FactoryPedido;
import br.lpm.items.MenuItem;

public class Main {
  public static void main(String args[]) {
    String tipo = "combo ramen grande e o-cha";
    List<String> acrescimos = Arrays.asList("proteina extra", "creme alho", "tofu");

    MenuItem pedido = FactoryPedido.criarPedido(tipo, acrescimos);

    System.out.println("Pedido: " + pedido.getDescricao());
    System.out.println("Preço final: " + pedido.getPreco());
  }

}
