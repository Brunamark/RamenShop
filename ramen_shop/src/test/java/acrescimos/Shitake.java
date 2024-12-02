package acrescimos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Porco;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class Shitake {
    private Prato pratoShitake;
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new Porco("Ramen Base", Tamanho.GRANDE);
        pratoShitake = new br.lpm.acrescimos.Shitake(pratoSimples);

    }

    @Test
    public void testShitakeDescricao() {
        assertEquals("Ramen BasePorcoShitake", pratoShitake.getDescricao());
    }

    @Test
    public void testShitakePreco() {
        assertEquals(28.7, pratoShitake.getPreco(), 0.01);
    }
}
