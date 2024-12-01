package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class ProteinaPorco extends Acrescimo {
    
    public ProteinaPorco(Prato prato){
        super(prato);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Proteina Porco";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 5.9;
    }
}
