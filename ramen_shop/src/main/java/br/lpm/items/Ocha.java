package br.lpm.items;

public class Ocha extends Bebida {
    
    public Ocha(PratoBase pratoBase){
        super(pratoBase);
    }
    public String getDescricao(){
        return "O-cha";
    }
    @Override
    public double getPreco(){
        return super.getPreco() + 3.9;
    }
}
