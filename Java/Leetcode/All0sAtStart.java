package Leetcode;

public class All0sAtStart 
{

    public static void ans(int[] arr)
    {
        int left = 0;
        int temp = 0;


        for(int right=0 ; right<arr.length ; right++)
        {
            if(arr[right] == 0)
            {
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left = left + 1;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {0, 1, 0, 3, 12};
        
        ans(arr);

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }    
}