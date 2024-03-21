

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */

public class CompanyTest {

    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    private Property property1;

    @BeforeEach
    public void setUp() {
        company = new Company();
        
        client1 = new User("José", "911111111", "zemanel@yahoo.com");
        client2 = new User("Manuel", "922222222", "tochico@hotmail.com");
        seller1 = new User("Francisco", "966777101", "fefe@remax.pt");
        seller2 = new User("Fernando", "966777152", "roro@remax.pt");

        property1 = new Property("T3 Monte Belo", 150000.0);

        company.registerClient(client1);
        company.registerClient(client2);
        company.registerSeller(seller1);
        company.registerSeller(seller2);
        company.registerProperty(property1);
    }

    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
}

