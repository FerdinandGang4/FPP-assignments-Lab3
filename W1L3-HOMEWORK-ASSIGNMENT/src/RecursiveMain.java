import java.util.Arrays;

public class RecursiveMain {
    public static void main(String[] args) {
        System.out.println("For palindrome");
        System.out.println(PalindromeNumber.isPalindrome(121));
        System.out.println(PalindromeNumber.isPalindrome(1210));

        System.out.println("Reversing Array");
        System.out.println(Arrays.toString(ReverseArray.reverseArray(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(ReverseArray.reverseArray(new int[]{-2,0,2,-5,5})));

        System.out.println("Get max number");
        System.out.println(GetMaxNumber.getMax(new int[]{2,3,5,7,9}));
        System.out.println(GetMaxNumber.getMax(new int[]{-2,3,0,7,10,-1}));

        System.out.println("Finding min character");
        System.out.println(MinChar.getMinChar("JavaisAfunNY"));
        System.out.println(MinChar.getMinChar("ferdinand"));
        System.out.println(MinChar.getMinChar("devendRa"));

    }
}

/*
For palindrome
true
false
Reversing Array
[5, 4, 3, 2, 1]
[5, -5, 2, 0, -2]
Get max number
9
10
Finding min character
A
a
R

*/