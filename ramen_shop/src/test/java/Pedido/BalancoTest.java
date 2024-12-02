package Pedido;


import br.lpm.Excecao.AdcionarAcrescimoErrado;
import br.lpm.Excecao.AdicionarAscrecimoNulo;
import br.lpm.Excecao.PedidoNulo;
import br.lpm.Excecao.QuantidadeZero;
import br.lpm.items.Boi;
import br.lpm.items.Porco;
import br.lpm.items.Tamanho;
import br.lpm.pedidos.Balanco;
import br.lpm.pedidos.EstadoPedido;
import br.lpm.pedidos.ListaDePedidos;
import br.lpm.pedidos.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BalancoTest {

    private Balanco balanco;
    private ListaDePedidos listaDePedidosMock;
    private Pedido pedido1;
    private Pedido pedido2;

    @BeforeEach
    void setup() {
        listaDePedidosMock = ListaDePedidos.getInstance();
        pedido1 = new Pedido(new Porco("Ramen Base", Tamanho.MEDIO));
        pedido2 = new Pedido(new Boi("Ramen Base", Tamanho.GRANDE));
        try {
            pedido2.adicionarAcrescimo("Shitake");
        } catch (AdicionarAscrecimoNulo e) {
            System.out.println(e.getMessage());
        } catch (AdcionarAcrescimoErrado e) {
            System.out.println(e.getMessage());
        }

        try {
            listaDePedidosMock.adicionarPedido(null);
        } catch (PedidoNulo e) {
            System.out.println(e.getMessage());
        }


        balanco = Balanco.getInstance();
    }

    @Test
    void testGetTicketMedioWithEmptyPedidos() {

        assertThrows(QuantidadeZero.class, balanco::getTicketMedio);
    }

    @Test
    void testGetTicketMedioWithValidPedidos() {

        try {
            listaDePedidosMock.adicionarPedido(pedido1);
            listaDePedidosMock.adicionarPedido(pedido2);
        }catch (PedidoNulo e) {
            System.out.println(e.getMessage());
        }


        double receitaTotal = 49.5;
        int quantidade = 2;
        double ticketMedioEsperado = receitaTotal / quantidade;

        assertDoesNotThrow(() -> {
            double ticketMedio = balanco.getTicketMedio();
            assertEquals(ticketMedioEsperado, ticketMedio, 0.01,
                    "O ticket médio não corresponde ao esperado");
        });
    }

    @Test
    void testGetQuantidade() {

        try{
            listaDePedidosMock.adicionarPedido(pedido1);
            listaDePedidosMock.adicionarPedido(pedido2);
        }catch (PedidoNulo e) {
            System.out.println(e.getMessage());
        }
       

        int quantidadeEsperada = 2;
        assertEquals(quantidadeEsperada, balanco.getQuantidade());
    }

    @Test
    void testGetPedidosRetirados() {

        try{
            pedido1.setEstado(EstadoPedido.RETIRADO);
            pedido2.setEstado(EstadoPedido.RETIRADO);

            listaDePedidosMock.adicionarPedido(pedido1);
            listaDePedidosMock.adicionarPedido(pedido2);
        }catch (PedidoNulo e) {
            System.out.println(e.getMessage());
        }
        

        List<Pedido> pedidosRetirados = balanco.getPedidos();
        assertEquals(2, pedidosRetirados.size(),
                "A quantidade de pedidos retirados não está correta.");
        assertTrue(pedidosRetirados.contains(pedido1), "Pedido retirado não encontrado na lista.");
    }
}
