import java.util.Scanner;

public class Palindrome 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number  :");
        int num = sc.nextInt();
        sc.close(); 

        int temp = num;
        int dig = 0;
        int rev = 0;

        while(num>0)
        {
            dig = num % 10;
            rev = (rev*10) + dig;
            num = num / 10;
        }

        if(temp == rev)
        {
            System.out.println("Palendrom");
        }
        else
        {
            System.out.println("Not a Palendrom");
        }
    }    
}