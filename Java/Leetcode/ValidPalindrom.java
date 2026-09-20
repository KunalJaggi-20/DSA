package Leetcode;

public class ValidPalindrom 
{
    public static void main(String[] args) 
    {
        String s = "A man, a plan, a canal: Panama";
        
        StringBuilder str = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                str.append(s.charAt(i));
            }
        }

        // System.out.println(str);


        int left = 0;
        int right = str.length() - 1;

        for(int i=0 ; i<str.length() ; i++)
        {
            if(Character.toLowerCase(str.charAt(left)) == Character.toLowerCase(str.charAt(right)))
            {
                left++;
                right--;
            }
            else
            {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }    
}