package br.lpm.business;

public class Shitake extends RamenDecorator {
    public Shitake(Ramen ramen){
        super(ramen);
    }
    @Override
    public Double getPreco(){
        return super.getPreco() + 6.9;
    }
}
