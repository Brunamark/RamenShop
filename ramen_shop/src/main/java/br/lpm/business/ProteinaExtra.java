package br.lpm.business;

public class ProteinaExtra extends RamenDecorator {
    public ProteinaExtra(Ramen ramen){
        super(ramen);
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 4;
    }
}
