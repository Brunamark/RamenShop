package acrescimos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.lpm.items.Prato;
import br.lpm.items.Tamanho;
import br.lpm.items.Vegano;

public class Crouton {
    private Prato pratoComCrouton;
    private Prato pratoSimples;

    @BeforeEach
    public void setup() {
        pratoSimples = new Vegano("Ramen Base", Tamanho.PEQUENO);
        pratoComCrouton = new br.lpm.acrescimos.Crouton(pratoSimples);

    }

    @Test
    public void testCroutonAcrescimoDescricao() {
        assertEquals("Ramen BaseVeganoCrouton", pratoComCrouton.getDescricao());
    }

    @Test
    public void testCroutonAcrescimoPreco() {
        assertEquals(15.8, pratoComCrouton.getPreco(), 0.01);
    }
}
