package br.lpm.business;

public class Porco extends RamenDecorator{

    public Porco(Ramen ramen){
        super(ramen);
    }

    @Override
    public Double getPreco(){
        return super.getPreco()+ 5.9;
    }
}
