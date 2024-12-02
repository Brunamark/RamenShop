package Pedido;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.pedidos.*;
import br.lpm.items.*;
import br.lpm.Excecao.AdcionarAcrescimoErrado;
import br.lpm.Excecao.AdicionarAscrecimoNulo;
import br.lpm.acrescimos.*;

public class PedidoTest {

    private Pedido pedido;
    private Prato pratoBase;

    @BeforeEach
    public void setup() {
        pratoBase = new Porco("Ramen Base", Tamanho.MEDIO);
        pedido = new Pedido(pratoBase);
    }

    @Test
    public void testInicializacaoPedido() {
        assertEquals(EstadoPedido.PENDENTE, pedido.getEstado());
        assertEquals(pratoBase.getPreco(), pedido.getPrecoTotal(), 0.01);
        assertNotNull(pedido.getId());
    }

    @Test
    public void testAdicionarAcrescimo() {
        try{
            pedido.adicionarAcrescimo("chili");
            pedido.adicionarAcrescimo("creme alho");
        }catch(AdcionarAcrescimoErrado e){
            System.out.println(e.getMessage());
        }catch(AdicionarAscrecimoNulo e){
            System.out.println(e.getMessage());
        }
       

        assertEquals("Ramen BasePorcoChiliCreme Alho", pedido.getDescricao());
        assertEquals(pratoBase.getPreco() + 2.5 + 1.5, pedido.getPrecoTotal(), 0.01);  
    }

    @Test
    public void testAlterarEstadoNotificaObservadores() {
        Observer observer = observable -> {
            assertTrue(observable instanceof Pedido);
            Pedido p = (Pedido) observable;
            assertEquals(EstadoPedido.PRONTO, p.getEstado());
        };
        pedido.addObserver(observer);

        pedido.setEstado(EstadoPedido.PRONTO);
    }

    @Test
    public void testAdicionarObservadores() {
        Observer observer1 = observable -> {};
        Observer observer2 = observable -> {};

        pedido.addObserver(observer1);
        pedido.addObserver(observer2);

        assertDoesNotThrow(() -> pedido.notifyAllObserver());
    }

    @Test
    public void testRemoverObservadores() {
        Observer observer = observable -> {};
        pedido.addObserver(observer);
        pedido.removeObserver(observer);

        assertDoesNotThrow(() -> pedido.notifyAllObserver());
    }
}
