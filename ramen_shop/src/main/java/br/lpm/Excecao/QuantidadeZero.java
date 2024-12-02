package br.lpm.Excecao;

public class QuantidadeZero extends Exception{
    
    public QuantidadeZero(){
        super("A quantidade não pode ser 0!");
    }
}
