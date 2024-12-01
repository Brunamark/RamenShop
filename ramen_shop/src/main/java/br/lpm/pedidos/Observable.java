package br.lpm.pedidos;


public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
