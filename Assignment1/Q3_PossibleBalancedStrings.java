//3.Possible Balanced Strings
//        Problem statement
//        Avisoft has been given a string S, consisting of only the '(' or ')' parenthesis. The string is not balanced, and to make the string balanced, he can remove one or more parentheses. He needs to print all possible balanced strings that can be formed from the given string by removing the minimum number of parentheses.
//        Note:
//        Print only those distinct strings that can be formed by removing the minimum number of parentheses.
//        If the string is already balanced, return the original string.
//        For example:
//        (()()()

//        Expected strings are:
//        [ (()()), (())(), ()()() ]
//        Sample Input 1:
//        1
//        (()()()
//        Sample Output 1:
//        1
//        Explanation Of Sample Input 1:
//        Test case 1:
//        For the first test case of sample output 1, three different strings can be created by removing one extra parenthesis.
package DAY_5.Assignment1;

import java.util.Scanner;
import java.util.Stack;

public class Q3_PossibleBalancedStrings
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        int count=0;
        int last=1;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                count++;
                last=0;
            }
            else if(count==0 || last==1 && ch==')')
            {
                count++;
                last=1;
            }
            else if(count!=0 && ch==')')
            {
                count--;
            }
            else
            {
                count--;
            }
        }
       if(count==0)
       {
           System.out.println(str);
       }
       else
       {
           System.out.println(count);
       }
    }
}
