package Leetcode;

public class SingleElement 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int ans = arr[0];

        for(int i=1 ; i<arr.length-1 ; i++)
        {
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
            {
                ans = arr[i];
            }
        }

        System.out.println(ans);
    }    
}