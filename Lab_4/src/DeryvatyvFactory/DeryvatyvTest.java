package DeryvatyvFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeryvatyvTest {

    @Test
    void estimateWeight() {
        Deryvatyv test = new Deryvatyv(5);
        assertEquals(21, test.estimateCost());
    }
}