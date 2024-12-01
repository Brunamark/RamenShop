package br.lpm.acrescimos;

import br.lpm.items.Prato;

public class ProteinaBoi extends Acrescimo {

    public ProteinaBoi(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Proteina Boi";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 7.9;
    }
}
