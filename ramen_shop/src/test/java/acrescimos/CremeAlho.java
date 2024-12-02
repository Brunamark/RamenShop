package acrescimos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Boi;
import br.lpm.items.Porco;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class CremeAlho {
    private Prato pratoComCremeAlho;
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new Porco("Ramen Base", Tamanho.GRANDE);
        pratoComCremeAlho = new br.lpm.acrescimos.CremeAlho(pratoSimples);

    }

    @Test
    public void testCremeAlhoAcrescimoDescricao() {
        assertEquals("Ramen BasePorcoCreme Alho", pratoComCremeAlho.getDescricao());
    }

    @Test
    public void testCremeAlhoAcrescimoPreco() {
        assertEquals(23.3, pratoComCremeAlho.getPreco(), 0.01);
    }
}
