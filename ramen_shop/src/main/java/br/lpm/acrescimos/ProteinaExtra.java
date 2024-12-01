package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class ProteinaExtra extends Acrescimo{

    public ProteinaExtra(Prato prato){
        super(prato);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Proteina Extra";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 4;
    }
}
