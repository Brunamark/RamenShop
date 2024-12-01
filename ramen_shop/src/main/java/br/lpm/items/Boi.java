package br.lpm.items;

public class Boi extends PratoBase{
    
    public Boi(String descricao, double preco, Tamanho tamanho){
        super(descricao,preco,tamanho);
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
