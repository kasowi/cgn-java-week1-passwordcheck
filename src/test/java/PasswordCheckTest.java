import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {



    @Test
    void hasDigitTest() {
        assertTrue(PasswordCheck.hasDigit("Hase1"));
    }
/*
    @Test
    void addMe() {
        assertEquals(9, PasswordCheck.addMe(2, 7));
    }

 */

    @Test
    void isSmart() {assertTrue(PasswordCheck.isSmart("Hasen93684ß1"));
    }
}