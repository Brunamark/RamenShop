package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class Crouton extends Acrescimo {
    public Crouton(Prato prato){
        super(prato);
    }

     @Override
    public String getDescricao(){
        return super.getDescricao() + "Crouton";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 2;
    }
}
