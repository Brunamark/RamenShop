package br.lpm;

import br.lpm.business.Boi;
import br.lpm.business.ProteinaExtra;
import br.lpm.business.Ramen;
import br.lpm.business.RamenDecorator;
import br.lpm.business.RamenGrande;
import br.lpm.business.RamenMedio;

public class Main {
    public static void main(String args[]) {
      Ramen meuRamen = new RamenMedio();
      System.out.println("Preço Total: R$ " + meuRamen.getPreco());
      meuRamen = new Boi(meuRamen);
      meuRamen = new ProteinaExtra(meuRamen);

      System.out.println("Preço Total: R$ " + meuRamen.getPreco());
    }

}
