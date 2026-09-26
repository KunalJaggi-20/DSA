package Leetcode;

public class MergeSortedArray 
{

    public static void main(String[] args) 
    {

        int A[] = {1, 2, 3, 0, 0, 0};
        int B[] = {2, 5, 6};

        int m = 3, n = 3;

        int i = m - 1;
        int j = n - 1;

        int idx = m + n - 1;

        while(i >= 0 && j >= 0)
        {
            if(A[i] > B[j])
            {
                A[idx] = A[i];
                i--;
                idx--;
            }
            else
            {
                A[idx] = B[j];
                j--;
                idx--;
            }
        }

        while(j >= 0)
        {
            A[idx] = B[j];
            j--;
            idx--;
        }

        for(int k = 0; k < A.length; k++)
        {
            System.out.print(A[k] + " ");
        }
    }
}