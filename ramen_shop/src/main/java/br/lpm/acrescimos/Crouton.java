package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class Crouton extends AcrescimoDecorator {
    public Crouton(MenuItem menuItem){
        super(menuItem);
    }

     @Override
    public String getDescricao(){
        return super.getDescricao() + "Crouton";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 2;
    }
}
