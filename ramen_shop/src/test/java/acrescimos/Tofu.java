package acrescimos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Porco;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class Tofu {
    private Prato pratoTofu;
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new Porco("Ramen Base", Tamanho.GRANDE);
        pratoTofu = new br.lpm.acrescimos.Tofu(pratoSimples);

    }

    @Test
    public void testTofuDescricao() {
        assertEquals("Ramen BasePorcoTofu", pratoTofu.getDescricao());
    }

    @Test
    public void testTofuPreco() {
        assertEquals(24.5, pratoTofu.getPreco(), 0.01);
    }
}
