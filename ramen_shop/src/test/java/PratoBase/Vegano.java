package PratoBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class Vegano {
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new br.lpm.items.Vegano("Ramen Base", Tamanho.GRANDE);

    }

    @Test
    public void testVeganoDescricao() {
        assertEquals("Ramen BaseVegano", pratoSimples.getDescricao());
    }

    @Test
    public void testVeganoPreco() {
        assertEquals(19.8, pratoSimples.getPreco(), 0.01);
    }
}
