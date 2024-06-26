

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PropertyTest
{
    @Test
    public void testConstructor(){
        String description = "T3 Monte Belo";
        double price = 150000.0;
        
        Property property1 = new Property(description, price);
        
        assertEquals(description, property1.getDescription());
        assertEquals(price, property1.getPrice());
        
    }
    @Test
    public void testToString() {
       
        String description = "T3 Monte Belo";
        double price = 150000.0;
        Property property1 = new Property(description, price);

        String result = property1.toString();

        String expected = "Descrição : " + "T3 Monte Belo" +
                "Preço    : " + 150000.0 + " Euros";
        assertEquals(expected, result);
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
