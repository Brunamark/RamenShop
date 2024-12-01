package br.lpm.pedidos;

import java.util.ArrayList;
import java.util.List;
import br.lpm.acrescimos.Chili;
import br.lpm.acrescimos.CremeAlho;
import br.lpm.acrescimos.Crouton;
import br.lpm.acrescimos.ProteinaExtra;
import br.lpm.acrescimos.Shitake;
import br.lpm.acrescimos.Tofu;
import br.lpm.items.Prato;

public class Pedido implements Observable {

    private EstadoPedido estado;
    private static int counter = 0;
    private Long id;
    private Prato prato;
    private List<Observer> observers = new ArrayList<>();


    public Pedido(Prato prato) {
        this.id = (long) counter++;
        this.estado = EstadoPedido.PENDENTE;
        this.prato = prato;
    }

    public EstadoPedido getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoPedido estadoPedido) {
        this.estado = estadoPedido;
        notifyAllObserver();
    }

    public Long getId() {
        return id;
    }

    public double getPrecoTotal() {
        return prato.getPreco();
    }

    public void adicionarAcrescimo(String tipoDeAcrescimo) {
        switch (tipoDeAcrescimo.toLowerCase()) {
            case "chili":
                this.prato = new Chili(this.prato);
                break;
            case "creme alho":
                this.prato = new CremeAlho(prato);
                break;
            case "crouton":
                this.prato = new Crouton(prato);
            break;
            case "proteina extra":
                this.prato = new ProteinaExtra(prato);
            break;
            case "shitake":
                this.prato = new Shitake(prato);
            break;
             case "tofu":
                this.prato = new Tofu(prato);
            break;
            default:
            break;

        }

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
