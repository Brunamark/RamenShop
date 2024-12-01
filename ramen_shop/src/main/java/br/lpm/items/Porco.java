package br.lpm.items;

public class Porco extends PratoBase{
    public Porco(String descricao, Double preco, Tamanho tamanho){
        super(descricao,preco,tamanho);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + "Porco";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 5.9;
    }
}
