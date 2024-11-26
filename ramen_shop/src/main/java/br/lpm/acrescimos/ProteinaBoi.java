package br.lpm.acrescimos;

import br.lpm.items.MenuItem;

public class ProteinaBoi extends AcrescimoDecorator {

    public ProteinaBoi(MenuItem menuItem) {
        super(menuItem);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Proteina Boi";
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + 7.9;
    }
}
