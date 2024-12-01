package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class ProteinaVegana extends Acrescimo{
    
    public ProteinaVegana(Prato prato){
        super(prato);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + ", Proteina Vegana";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 3.9;
    }
}
