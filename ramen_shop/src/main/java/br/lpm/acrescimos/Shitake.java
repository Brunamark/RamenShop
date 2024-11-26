package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class Shitake extends AcrescimoDecorator {
    public Shitake(MenuItem menuItem){
        super(menuItem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Shitake";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 6.9;
    }
}
