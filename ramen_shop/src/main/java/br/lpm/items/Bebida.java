package br.lpm.items;

public abstract class Bebida {
    private double preco;

    
    protected Bebida(PratoBase pratoBase){
        this.preco = pratoBase.getPreco();
    }
    public double getPreco(){
        return this.preco;
    } 
    public abstract String getDescricao();
}
