public class RecursiveApp {

     //Question 1
    public char getMinChar(String s) //utility method
    {
        int i = 0;
        return getMinCharHelper(s, i);
    }

    private char getMinCharHelper(String s, int index) //Helper method
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

    //Question 2
    public int[] reverseArray(int[] a)//Utility method for reverse
    {
        int startIndex = 0;
        int endIndex = a.length-1;
        return reverseHelper(a, startIndex,endIndex);
    }

    //private helper method
   private int[] reverseHelper(int[] a, int startIndex, int endIndex)//Private helper
   {
      if(startIndex >= endIndex) //base case
      {
          return a;
      }
      else {
          int temp = a[startIndex];
          a[startIndex] = a[endIndex];
          a[endIndex] = temp;
          return  reverseHelper(a,startIndex+1,endIndex-1);
      }
   }

   //Question 3
   public boolean isPalindrome(int a) //Utility method
   {
       int digits = (int)Math.log10(a)+1;
       return isPalindromHelper(a,digits);
   }

   private boolean isPalindromHelper(int n , int digits)//This is my helper method
   {
       if(digits<=1) { return  true; }
       int firstdigit = n/(int)Math.pow(10,digits-1);//get first digit
       int lastdigit = n%10;  //get last digit
       if(firstdigit!=lastdigit) { return false;}
       //remove first and last digits and get the middle part of the number
       int middle = n % (int)Math.pow(10, digits-1)/10;
       return isPalindromHelper(middle, digits-2); //recursive call toward the base case
    }

    //Question 4
    public int getMax(int[] a)
    {
        int index = 0;
        int maxValue =a[0];
        return getMaxHelper(a,index,maxValue);
    }

    private int getMaxHelper(int[]a, int index, int maxValue) //Helper method
    {
        if(a.length == index)
        {
            return maxValue;
        }

       if(a[index] > maxValue)
        {
            maxValue = a[index];
        }
        return  getMaxHelper(a,index+1, maxValue);
       }
    }
