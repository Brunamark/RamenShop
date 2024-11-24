package br.lpm.business;

public class Boi extends RamenDecorator{
    public Boi(Ramen ramen){
        super(ramen);
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 7.9;
    }
}
