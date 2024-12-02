package acrescimos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import br.lpm.items.Boi;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;

public class ChiliTest {


    private Prato pratoComChili;
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new Boi("Ramen Base", Tamanho.MEDIO);
        pratoComChili = new br.lpm.acrescimos.Chili(pratoSimples);

    }

    @Test
    public void testChiliAcrescimoDescricao() {
        assertEquals("Ramen BaseBoiChili", pratoComChili.getDescricao());
    }

    @Test
    public void testChiliAcrescimoPreco() {
        assertEquals(23.3, pratoComChili.getPreco(), 0.01); 
    }

  
}


