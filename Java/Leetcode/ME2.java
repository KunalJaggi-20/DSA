/**
 *   Majority Element
 *   Sorting Algorithm → O(nlogn) 
 * 
 *  1. Sort the array
 *  2. Iterate through the array and count the frequency of each element
 *  3. If the frequency is greater than n/2, return that element as the
 *  4. If no element is found with count greater than n/2, return -
 * 
 * 
 *  Less Time Complexity → O(nlog n)
 */
package Leetcode;

import java.util.Arrays;

public class ME2 
{
    public static void main(String[] args) 
    {
        int arr[] = {3, 2, 3};
        Arrays.sort(arr);

        int freq = 1;
        int ans = arr[0];

        

        for(int i=1 ; i<arr.length ; i++)
        {
            if(arr[i] == arr[i-1])
            {
                freq++;
            }
            else
            {
                freq = 1;
                ans = arr[i];
            }

            if(freq > arr.length/2)
            {
                System.out.println(ans);
                return;
            }
        }
    }
    
}
/*

Another Simple Approach → O(n)

import java.util.Arrays;

class Solution {

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}

*/