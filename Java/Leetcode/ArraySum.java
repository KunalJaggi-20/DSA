/*

    arr = [1, 2, 4, 6, 10] // Assending Order Array
    target = 8
    
    Two Pointer

    Output → (2, 6)

*/
package Leetcode;

public class ArraySum 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 4, 6, 10};
        int target = 8;

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum == target)
            {
                System.out.println("Output → (" + arr[left] + ", " + arr[right] + ")");
                return;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

    }    
}