package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class CremeAlho extends Acrescimo{
    public CremeAlho(Prato prato){
        super(prato);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Creme Alho";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 1.5;
    }
}
