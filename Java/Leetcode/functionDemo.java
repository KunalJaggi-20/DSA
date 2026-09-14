package Leetcode;

import java.util.Scanner;

class demo
{
    Scanner sc = new Scanner(System.in);

    demo()
    {
        System.out.println("Hello, World!");
    }

    String name()
    {
        System.out.println("Enter Your Name : ");
        String str = sc.nextLine();

        return "Name : "+str;
    }
}

public class functionDemo 
{
    public static void main(String[] args) 
    {
        demo d = new demo();
        System.out.print(d.name());    
    }    
}