package br.lpm.business;

public class CremeAlho extends RamenDecorator {
    public CremeAlho(Ramen ramen){
        super(ramen);
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 1.5;
    }
}
