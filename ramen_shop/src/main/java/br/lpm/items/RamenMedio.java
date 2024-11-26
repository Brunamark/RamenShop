package br.lpm.items;

public class RamenMedio implements MenuItem {
    @Override
    public String getDescricao() {
		return "Ramen medio";
	}

    @Override 
    public Double getPreco(){
        return 12.9;
    }

}
