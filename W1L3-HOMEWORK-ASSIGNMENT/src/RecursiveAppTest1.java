import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveAppTest1 {
    RecursiveApp myApp;
    @BeforeEach
    void setUp() {
        myApp = new RecursiveApp();
    }
    
    @Test
    void getMinCharTest() {
        String s = "ferdinand";
        char act = myApp.getMinChar(s);
        char exp ='a';
        assertEquals(exp, act);
    }

    @org.junit.jupiter.api.Test
    void isPalindromeTest() {
        int value = 23332;
        boolean act = myApp.isPalindrome(value);
        boolean exp = true;
        assertEquals(exp,act);
    }

    @Test
    void isNotPalindromeTest() {
        int value = 23312;
        boolean act = myApp.isPalindrome(value);
        boolean exp = false;
        assertEquals(exp,act);
    }

    @Test
    void getMaxTest() {
        int []a = {1,3,5,7,2};
        int act = myApp.getMax(a);
        int exp =7;
        assertEquals(exp,act);
    }
}