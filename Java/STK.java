import java.util.Scanner;

class MyStack
{
    int top=-1 , size=0 , stk[];

    MyStack(int size)
    {
        this.size  = size;
        stk = new int[size];
    }

    int menu()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1] PUSH");
        System.out.println("2] POP ");
        System.out.println("3] DISP");
        System.out.println("4] PEEK");
    
        int select = sc.nextInt();

        return select;
    }

    void PUSH(int value)
    {
        if(top == size -1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            stk[top++] = value;
            System.out.println("PUSHED : "+value);
        }
    }
}


public class STK 
{
    public static void main(String[] args) 
    {

    }    
}