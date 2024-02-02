//1.Similar Strings
//        Problem statement
//        You are given two strings, ‘A’ and ‘B’ each of length ‘N’. Your task is to print 1 if ‘A’ is similar to ‘B’.
//        Note :
//        String ‘A’ is said to be similar to string ‘B’ if and only if
//        1. ‘A’ is equal to ‘B’.
//        2. Divide both ‘A’ and ‘B’ into two – two strings ‘A1’, ‘A2’ , ‘B1’ and ‘B2’ such that both of them('A1' and 'A2') have same size. Then at least one of the following must hold true:
//        a. ‘A1’ is similar to ‘B1’ and ‘A2’ is similar to ‘B2’.
//        b. ‘A1’ is similar to ‘B2’ and ‘A2’ is similar to ‘B1’.
//        Sample Input 1 :
//        2
//        aa aa
//        ab ba
//        Sample Output 1 :
//        1
//        1
//        Explanation Of Sample Input 1 :
//        Test Case 1 :
//        Given A = “aa” and B = “aa”
//        Here A and B are equal. So A is similar to B.

package DAY_5.Assignment1;
import java.util.Scanner;
public class Q1_EqualHalves
{
    public static void main(String[] args)
    {
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter two Strings");
           String str1=sc.next();
           String str2=sc.next();
           int n=str1.length();
           int m=str2.length();

           if((n%2!=0)|| (m%2!=0))
           {
               System.out.println("Enter Even length of Strings");
           }
           else
           {
               if(n!=m)
               {
                   System.out.println("Strings are not equal");
               }
               else
               {
                   int s=0;
                   int e=n-1;
                   int mid=(s+e)/2;
                   String a1="";
                   String a2="";
                   String b1="";
                   String b2="";
                   for(int i=0;i<=mid;i++)
                   {
                       a1=a1+str1.charAt(i);
                       b1=b1+str2.charAt(i);
                   }
                   for(int i=mid+1;i<n;i++)
                   {
                       a2=a2+str1.charAt(i);
                       b2=b2+str2.charAt(i);
                   }
                   if((a1.equals(b1) && a2.equals(b2))||(a1.equals(b2) && a2.equals(b1)))
                   {
                       System.out.println("Equal");
                   }
                   else
                   {
                       System.out.println("Not Equal");
                   }
               }
           }
    }
}
