package br.lpm.business;

public class Vegano extends RamenDecorator {
    
    public Vegano(Ramen ramen){
        super(ramen);
    }

    @Override
    public Double getPreco(){
        return super.getPreco() + 3.9;
    }
}
