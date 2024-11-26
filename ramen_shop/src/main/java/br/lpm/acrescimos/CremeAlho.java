package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class CremeAlho extends AcrescimoDecorator{
    public CremeAlho(MenuItem menuItem){
        super(menuItem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Creme Alho";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 1.5;
    }
}
