package br.lpm.items;

public class RamenPequeno implements MenuItem {
    @Override
    public String getDescricao() {
		return "Ramen pequeno";
	}

    @Override 
    public Double getPreco(){
        return 9.9;
    }

}
