package PratoBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Bebida;
import br.lpm.items.PratoBase;
import br.lpm.items.Tamanho;
import br.lpm.items.Porco;

public class OchaTest {
    private PratoBase pratoSimples;
    private Bebida kocha;

    @BeforeEach
    public void setup() {
        pratoSimples = new Porco("Ramen Base", Tamanho.GRANDE);
        kocha = new br.lpm.items.Ocha(pratoSimples);
    }

    @Test
    public void testKochaDescricao() {
        assertEquals("O-cha", kocha.getDescricao());
    }

    @Test
    public void testKochaPreco() {
        assertEquals(25.7, kocha.getPreco(), 0.01);
    }
}
