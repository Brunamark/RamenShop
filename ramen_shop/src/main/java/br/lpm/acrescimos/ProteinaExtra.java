package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class ProteinaExtra extends AcrescimoDecorator{

    public ProteinaExtra(MenuItem menuItem){
        super(menuItem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Proteina Extra";
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 4;
    }
}
