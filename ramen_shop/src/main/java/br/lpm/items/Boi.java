package br.lpm.items;

public class Boi extends PratoBase{
    
    public Boi(String descricao, Tamanho tamanho){
        super(descricao,tamanho);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Boi";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 7.9;
    }
}
