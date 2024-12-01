package br.lpm.pedidos;

public class Cliente implements Observer{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof Pedido) {
            Pedido pedido = (Pedido) observable;
            System.out.println("Cliente " + nome + " recebeu a notificação: Pedido #" + pedido.getId() + " está " + pedido.getEstado());
        }
    }

}
