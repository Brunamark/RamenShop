package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class ProteinaVegana extends AcrescimoDecorator{
    
    public ProteinaVegana(MenuItem menuItem){
        super(menuItem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + ", Proteina Vegana";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 3.9;
    }
}
