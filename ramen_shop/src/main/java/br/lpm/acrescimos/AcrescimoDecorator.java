package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public abstract class AcrescimoDecorator implements MenuItem {
    private final MenuItem menuItem;

    public AcrescimoDecorator(MenuItem menuItem) {
        if (menuItem == null) {
            throw new RuntimeException("Acrescimo deve estar associado a uma item do menu.");
        }
        this.menuItem = menuItem;
    }

    @Override
    public Double getPreco() {
        return menuItem.getPreco();
    }


    @Override
    public String getDescricao() {
        return menuItem.getDescricao();

    }
}
