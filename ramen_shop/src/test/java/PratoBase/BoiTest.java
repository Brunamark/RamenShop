package PratoBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class BoiTest {
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new br.lpm.items.Boi("Ramen Base", Tamanho.GRANDE);

    }

    @Test
    public void testBoiDescricao() {
        assertEquals("Ramen BaseBoi", pratoSimples.getDescricao());
    }

    @Test
    public void testBoiPreco() {
        assertEquals(23.8, pratoSimples.getPreco(), 0.01);
    }
}
