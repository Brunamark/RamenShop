package br.lpm.pedidos;

import java.util.List;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
