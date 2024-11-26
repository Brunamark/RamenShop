package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class Tofu extends AcrescimoDecorator {

    public Tofu(MenuItem menuItem){
        super(menuItem);
    }
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Tofu";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 2.7;
    }
}
