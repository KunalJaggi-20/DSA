package Leetcode;

public class SecondLargestElement 
{
    
    public static void main(String[] args) 
    {
        int arr[] = {3, 2, 1, 5, 6, 4};
        int largest = arr[0];
        int secondLargest = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
              
        }
        System.out.println(secondLargest);
    }
}