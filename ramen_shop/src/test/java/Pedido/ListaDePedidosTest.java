package Pedido;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.pedidos.*;
import br.lpm.Excecao.PedidoNulo;
import br.lpm.items.*;

public class ListaDePedidosTest {

    private ListaDePedidos listaDePedidos;
    private Pedido pedido1;
    private Pedido pedido2;

    @BeforeEach
    public void setup() {
        listaDePedidos = ListaDePedidos.getInstance();
        listaDePedidos.getPedidos().clear(); 
        pedido1 = new Pedido(new Porco("Ramen Base", Tamanho.MEDIO));
        pedido2 = new Pedido(new Porco("Ramen Base", Tamanho.GRANDE));
        try{
       

            listaDePedidos.adicionarPedido(pedido1);
            listaDePedidos.adicionarPedido(pedido2);
        }catch(PedidoNulo e){
            System.out.println(e.getMessage());
        }
       

      
    }

    @Test
    public void testAdicionarPedido() {
        assertEquals(2, listaDePedidos.getPedidos().size(), "A lista deve conter 2 pedidos.");
        assertTrue(listaDePedidos.getPedidos().contains(pedido1), "A lista deve conter o pedido1.");
        assertTrue(listaDePedidos.getPedidos().contains(pedido2), "A lista deve conter o pedido2.");
    }

    @Test
    public void testGetPedidos() {
        List<Pedido> pedidos = listaDePedidos.getPedidos();
        assertNotNull(pedidos, "A lista de pedidos não deve ser nula.");
        assertEquals(2, pedidos.size(), "A lista de pedidos deve conter 2 pedidos.");
    }

    @Test
    public void testGetPedidosQuandoVazio() {
        listaDePedidos.getPedidos().clear();
        assertTrue(listaDePedidos.getPedidos().isEmpty(), "A lista de pedidos deve estar vazia.");
    }

    @Test
    public void testSingleton() {
        ListaDePedidos novaListaDePedidos = ListaDePedidos.getInstance();
        assertSame(listaDePedidos, novaListaDePedidos, "A instância de ListaDePedidos deve ser única.");
    }
}