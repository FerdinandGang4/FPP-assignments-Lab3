public class MinChar {
    //Question 1
    public static char getMinChar(String s) //utility method
    {
        int i = 0;
        return getMinCharHelper(s, i);
    }

    private static char getMinCharHelper(String s, int index) //Helper method
    {
        if(s.length() -1 == index) //base case
        {
            return  s.charAt(index);
        }
        else {
            char minCha = getMinCharHelper(s, index+1);
            return  (minCha < s.charAt(index))? minCha:s.charAt(index);
        }
    }

}
