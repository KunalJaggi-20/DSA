/*
    Majority Element

    Brute Force Algorithm → O(n^2)
    1. Iterate through the array and for each element, count its occurrences in the array
    2. If the count is greater than n/2, return that element as the majority element
    3. If no element is found with count greater than n/2, return -

*/  

package Leetcode;

public class ME1 
{
    public static void main(String[] args) 
    {
        int arr[] = {3, 2, 3};
        int n = arr.length;

        for(int i=0 ; i<n ; i++)
        {
            int count = 0;

            for(int j=0 ; j<n ; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            if(count > n/2)
            {
                System.out.println(arr[i]);
                return;
            }
        }
    }    
}