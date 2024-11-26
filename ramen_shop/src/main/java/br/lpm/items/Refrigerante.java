package br.lpm.items;

public class Refrigerante implements MenuItem{
    @Override
    public String getDescricao() {
		return "Refrigerante";
	}

    @Override 
    public Double getPreco(){
        return 5.9;
    }
}
