package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class ProteinaPorco extends AcrescimoDecorator {
    
    public ProteinaPorco(MenuItem menuItem){
        super(menuItem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Proteina Porco";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 5.9;
    }
}
