package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class Acrescimo implements Prato {
    private Prato prato;

    public Acrescimo(Prato prato){
        this.prato = prato;
    }

    @Override
    public String getDescricao() {
       return prato.getDescricao();
    }

    @Override
    public double getPreco() {
        return prato.getPreco();
    }
}
