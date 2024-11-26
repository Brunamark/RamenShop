package br.lpm.items;

import java.util.ArrayList;
import java.util.List;

public class Combo implements MenuItem{
     private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    @Override
    public String getDescricao() {
        StringBuilder description = new StringBuilder("Combo: ");
        for (MenuItem item : items) {
            description.append(item.getDescricao()).append(", ");
        }
        return description.substring(0, description.length() - 2);
    }

    @Override
    public Double getPreco() {
        Double totalPrice = 0.0;
        for (MenuItem item : items) {
            totalPrice += item.getPreco();
        }
        return totalPrice;
    }
}
