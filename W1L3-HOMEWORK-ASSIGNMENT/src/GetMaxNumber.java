public class GetMaxNumber {
    //Question 4
    public static int getMax(int[] a)
    {
        int index = 0;
        int maxValue =a[0];
        return getMaxHelper(a,index,maxValue);
    }

    private static int getMaxHelper(int[]a, int index, int maxValue) //Helper method
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
