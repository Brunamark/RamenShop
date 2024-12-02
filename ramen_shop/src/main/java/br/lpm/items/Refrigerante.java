package br.lpm.items;

public class Refrigerante extends Bebida{

    public Refrigerante(PratoBase pratoBase){
        super(pratoBase);
    }
    public String getDescricao(){
        return "Refrigerante";
    }
    @Override
    public double getPreco(){
        return super.getPreco() + 5.9;
    }
}
