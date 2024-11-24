package br.lpm.business;

public abstract class RamenDecorator  implements Ramen {
    protected Ramen ramen;

    public RamenDecorator(Ramen ramen) {
        this.ramen = ramen;
    }

    @Override
    public Double getPreco(){
        return ramen.getPreco();
    }



    
}
