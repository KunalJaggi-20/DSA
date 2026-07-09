import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a nuumber : ");
        int num = sc.nextInt();
        sc.close();

        int og = num ,test = num;
        int len = 0 ,dig = 0 ,result = 0;
    
        while(test > 0)
        {
            len++;
            test /= 10;
        }
        
        while(num>0)
        {
            dig = num % 10;
            result += Math.pow(dig, len);
            num = num / 10;
 
        }

        if(og == result)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number ");
       }

    }
}