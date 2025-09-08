public class ReverseArray {
    //Question 2
    public static int[] reverseArray(int[] a)//Utility method for reverse
    {
        int startIndex = 0;
        int endIndex = a.length-1;
        return reverseHelper(a, startIndex,endIndex);
    }

    //private helper method
    private static int[] reverseHelper(int[] a, int startIndex, int endIndex)//Private helper
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

}
