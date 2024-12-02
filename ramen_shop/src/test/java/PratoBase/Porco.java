package PratoBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class Porco {
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new br.lpm.items.Porco("Ramen Base", Tamanho.GRANDE);

    }

    @Test
    public void testPorcoDescricao() {
        assertEquals("Ramen BasePorco", pratoSimples.getDescricao());
    }

    @Test
    public void testPorcoPreco() {
        assertEquals(21.8, pratoSimples.getPreco(), 0.01);
    }
}
