package br.lpm.Excecao;

public class AdicionarAscrecimoNulo extends Exception {
    public AdicionarAscrecimoNulo(){
        super("Ao adicionar acrescimo não pode ser nulo");
    }
}
