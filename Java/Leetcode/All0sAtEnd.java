package Leetcode;

class solution
{
    public void all0atEnd(int[] arr)
    {
        int left = 0;
        int temp;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] != 0) {

                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                left = left + 1;
            }
        }

    }
}

public class All0sAtEnd 
{

    public static void main(String[] args) 
    {

        solution s = new solution();

        int[] arr = {0, 1, 0, 3, 12};

        s.all0atEnd(arr);


        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}