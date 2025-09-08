import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveAppTest {
//Get minimum character tests cases
    @Test
    void getMinCharTest1() {
        String s = "ferdinand and devendra";
        char act = MinChar.getMinChar(s);
        char exp =' ';
        assertEquals(exp, act);
    }

    @Test
    void getMinCharTest2() {
        String s = "ferdinandAanddevendra";
        char act = MinChar.getMinChar(s);
        char exp ='A';
        assertEquals(exp, act);
    }

    //IsPalindrome test cases
    @Test
    void isPalindromeTest() {
        int value = 23332;
        boolean act = PalindromeNumber.isPalindrome(value);
        boolean exp = true;
        assertEquals(exp,act);
    }

    @Test
    void isNotPalindromeTest() {
        int value = 23312;
        boolean act = PalindromeNumber.isPalindrome(value);
        boolean exp = false;
        assertEquals(exp,act);
    }

    //Get maximum number test cases
    @Test
    void getMaxTest() {
        int []a = {1,3,5,7,2};
        int act = GetMaxNumber.getMax(a);
        int exp =7;
        assertEquals(exp,act);
    }

    // Test cases of reversing array
    @Test
    void arrayIsReversed(){
        int []original = {1,3,5,7,2};
        int []expected = ReverseArray.reverseArray(original);
        assertArrayEquals(expected, original);
    }

    @Test
    void arrayIsReversed2(){
        int []original = {-1,0,5,7,2};
        int []expected = ReverseArray.reverseArray(original);
        assertArrayEquals(expected, original);
    }
}