package br.lpm.fabrica;

import java.util.List;
import br.lpm.acrescimos.Chili;
import br.lpm.acrescimos.CremeAlho;
import br.lpm.acrescimos.Crouton;
import br.lpm.acrescimos.ProteinaExtra;
import br.lpm.acrescimos.Shitake;
import br.lpm.acrescimos.Tofu;
import br.lpm.items.Combo;
import br.lpm.items.KoCha;
import br.lpm.items.MenuItem;
import br.lpm.items.OCha;
import br.lpm.items.RamenGrande;
import br.lpm.items.RamenMedio;
import br.lpm.items.RamenPequeno;
import br.lpm.items.Refrigerante;

public class FactoryPedido {

    public static MenuItem criarPedido(String tipo, List<String> acrescimos) {
        MenuItem menuItem;
        switch (tipo.toLowerCase()) {
            case "ramen pequeno":
                menuItem = new RamenPequeno();
                break;
            case "ramen medio":
                menuItem = new RamenMedio();
                break;
            case "ramen grande":
                menuItem = new RamenGrande();
                break;
            case "refrigerante":
                menuItem = new Refrigerante();
                break;
            case "ocha":
                menuItem = new OCha();
                break;
            case "kocha":
                menuItem = new KoCha();
                break;
            case "combo ramen grande e refrigerante":
                menuItem = criarCombo(new RamenGrande(), new Refrigerante());
                break;
            case "combo ramen medio e refrigerante":
                menuItem = criarCombo(new RamenMedio(), new Refrigerante());
                break;
            case "combo ramen pequeno e refrigerante":
                menuItem = criarCombo(new RamenPequeno(), new Refrigerante());
                break;
            case "combo ramen grande e o-cha":
                menuItem = criarCombo(new RamenGrande(), new OCha());
                break;
            case "combo ramen medio e o-cha":
                menuItem = criarCombo(new RamenMedio(), new OCha());
                break;
            case "combo ramen pequeno e o-cha":
                menuItem = criarCombo(new RamenPequeno(), new OCha());
                break;
            case "combo ramen grande e ko-cha":
                menuItem = criarCombo(new RamenGrande(), new KoCha());
                break;
            case "combo ramen medio e ko-cha":
                menuItem = criarCombo(new RamenMedio(), new KoCha());
                break;
            case "combo ramen pequeno e ko-cha":
                menuItem = criarCombo(new RamenPequeno(), new KoCha());
                break;
            default:
                throw new IllegalArgumentException("Tipo do item desconhecido: " + tipo);
        }
        if (acrescimos != null && !acrescimos.isEmpty()) {
            for (String acrescimo : acrescimos) {
                menuItem = aplicarAcrescimo(menuItem, acrescimo);
            }
        }
        return menuItem;
    }

    private static Combo criarCombo(MenuItem item1, MenuItem item2) {
        Combo combo = new Combo();
        combo.addItem(item1);
        combo.addItem(item2);
        return combo;
    }

    private static MenuItem aplicarAcrescimo(MenuItem base, String acrescimo) {
        switch (acrescimo.toLowerCase()) {
            case "proteina extra":
                return new ProteinaExtra(base);
            case "chilli":
                return new Chili(base);
            case "creme alho":
                return new CremeAlho(base);
            case "croutons":
                return new Crouton(base);
            case "shitake":
                return new Shitake(base);
            case "tofu":
                return new Tofu(base);
            default:
                throw new IllegalArgumentException("Acréscimo desconhecido: " + acrescimo);
        }
    }
}
