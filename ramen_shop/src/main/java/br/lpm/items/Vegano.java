package br.lpm.items;

public class Vegano extends PratoBase{

    public Vegano(String descricao, double preco, Tamanho tamanho){
        super(descricao,preco,tamanho);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Vegano";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 3.9;
    }
}
