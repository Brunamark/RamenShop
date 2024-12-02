package acrescimos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Porco;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class ProteinaExtra {
    private Prato pratoProteinaExtra;
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new Porco("Ramen Base", Tamanho.GRANDE);
        pratoProteinaExtra = new br.lpm.acrescimos.ProteinaExtra(pratoSimples);

    }

    @Test
    public void testProteinaExtraDescricao() {
        assertEquals("Ramen BasePorcoProteina Extra", pratoProteinaExtra.getDescricao());
    }

    @Test
    public void testProteinaExtraPreco() {
        assertEquals(25.8, pratoProteinaExtra.getPreco(), 0.01);
    }
}
