import java.util.Scanner;

public class LargestElement 
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int arr[];

        System.out.println("Enter Size of Array : ");
        size = sc.nextInt();

        arr = new int[size];

        for(int i=0 ; i<size ; i++)
        {
            System.out.println("Enter "+(i+1)+" Element : ");

            arr[i] = sc.nextInt();    
        }

        int max = arr[0];

        for(int i=0 ; i<size ; i++)
        {
            if(max < arr[i])
            {
                max  = arr[i];
            }
        }

        int min = arr[0];

        for(int i=0 ; i<size ; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println("Maximum Value : "+max);
        System.out.println("Minimum Value : "+min);

    }    
}
