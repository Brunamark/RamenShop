package br.lpm.items;

public class Kocha extends Bebida {
    
 
    public Kocha(PratoBase pratoBase) {
        super(pratoBase);  
    }
    @Override
    public String getDescricao(){
        return  "Ko-Cha";
    }

    @Override 
    public double getPreco(){
        return super.getPreco() + 0.0;
    }
}
