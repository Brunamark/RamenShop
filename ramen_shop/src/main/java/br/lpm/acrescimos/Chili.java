package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class Chili extends AcrescimoDecorator{

    public Chili(MenuItem menuItem){
        super(menuItem);
    }
    @Override
    public String getDescricao(){
        return super.getDescricao() + "Chili";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 2.5;
    }
}
