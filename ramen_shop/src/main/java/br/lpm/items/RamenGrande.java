package br.lpm.items;

public class RamenGrande implements MenuItem{

    @Override
    public String getDescricao() {
        return "Ramen grande";
    }

    @Override
    public Double getPreco() {
        return 15.9;
    }
}
