package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class Chili extends Acrescimo{

    public Chili(Prato prato){
        super(prato);
    }
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Chili";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 2.5;
    }
}
