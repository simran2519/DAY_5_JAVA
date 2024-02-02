//4.Multiply Strings
//        Problem statement
//        You are given two big numbers ‘A’ and ‘B’ as strings. Your task is to find the product of both the numbers.
//
//        Note:
//
//        There are no leading zeros in both the strings, except the number 0 itself.
//        Do not use any built-in Big Integer Library.
//        For Example:
//        If, A = 123, and B = 456.
//        So the product of both numbers will be 56088.
//
//        Sample Input 1:
//        2
//        17281
//        91276
//        123
//        456
//        Sample Output 1:
//        1577340556
//        56088
//        Explanation for sample 1:
//        For the first test case:
//        A=17281, and B=91276
//        The product of both numbers is 1577340556.
//
//        For the second test case:
//        A=123, B=456
//        The product of both numbers is 56088
package DAY_5.Assignment1;

import java.util.Scanner;

public class Q4_MultiplyStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1");
        String str1 = sc.next();
        System.out.println("enter the string2");
        String str2 = sc.next();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        int n = str1.length();
        int m = str2.length();
        int ans =0 ;
        int pow =1;
        for(int i = n-1 ;i>=0 ;i--)
        {
            int prod = 0;
            int pr = 0 , carry =0 ,rem=0, p=1;
            for(int j = m-1 ;j>=0;j--){
                pr = (arr1[i] - '0') * (arr2[j] - '0');
//                pr = Character.getNumericValue(arr1[i]) *    Character.getNumericValue(arr2[j])   ;
                rem = pr + carry;
                carry = rem/10;
                rem = rem%10;
                prod = prod +(rem*p);
                p= p*10;

            }
            rem= carry;
            prod = prod + rem * p;
            ans = ans + prod*pow;
            pow = pow * 10;
        }
        System.out.println(ans);

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter two Strings");
//        String str1=sc.next();
//        String str2=sc.next();
//
//        char arr1[]= str1.toCharArray();
//        char arr2[]=str2.toCharArray();
//
//        for(int i= arr2.length-1;i>=0;i--)
//        {
//            int ans=0;
//            int carry=0;
//            int p=Character.getNumericValue(arr1[arr1.length-1])* Character.getNumericValue(arr2[i]);
//            System.out.println(p);
//            for(int j=arr1.length-2;j>=0;j--)
//            {
//                int ld=p%10;
//                ans=(ans*10)+ld;
//                carry=p/10;
//                p=Character.getNumericValue(arr1[j])*Character.getNumericValue(arr2[i]);
//            }
//            System.out.println(ans);
        }
    }




