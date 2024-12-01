package br.lpm.items;


public abstract class PratoBase implements Prato{
    
    private double[] precoBase = new double[]{9.9,12.9, 15.9};
    private String descricao;
    private Double preco;
    private Tamanho tamanho;



    protected PratoBase(String descricao, Double preco, Tamanho tamanho) {
        this.descricao = descricao;
        this.preco = precoBase[tamanho.getValue()];
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao(){
            return this.descricao;
    }

    @Override
    public double getPreco(){
        return this.preco;
    }
    
    public Tamanho getTamanho(){
        return this.tamanho;
    }
}
