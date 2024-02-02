//2.Distinct Substrings
//        Problem statement
//        You are given a string 'S' of length 'N' consisting of lowercase English letters. You want all substrings of the string 'S' to be distinct. You are allowed to change characters at some positions to some other lowercase English letters.
//        You have to find the minimum number of changes required to make all the substrings of the string distinct or return -1 if you can't make it.
//        A substring is a contiguous subsegment of a string. For example, "acab" is a substring of "abacaba" (it starts in position 3 and ends in position 6), but "aa" or "d" aren't substrings of this string.
//        Hint:
//        Think about substrings of length one.
//        For Example:-
//        Let 'N' = 3, 'S' = "aac".
//        You can change characters at index 2 to some other character (1-based indexing).
//        Like 'S' = "abc".
//        All substrings of 'S' are "a", "b", "c", "ab", "bc", "abc", all of which are distinct.
//        So the answer is 1.
//        Sample Input 1:-
//        2
//        3
//        abc
//        4
//        xxyz
//        Sample Output 1:-
//        0
//        1
//        Explanation of sample input 1:-
//        First test case:-
//        No changes are required.
//        So the answer is 0.
//
//        Second test case:-
//        You can change the character at index 1 to some other character (1-based indexing).
//        Like 'S'="bxyz".
//        So the answer is 1.
package DAY_5.Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_DistinctSubstrings
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        int count=0;
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        str=String.valueOf(arr);
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i-1);
            if(ch==ch1)
            {                                      //abacd  //aabcd
                count++;
            }
        }

        System.out.println(count);
    }
}

//for(int j=i;j<str.length();j++)
//            {
//                g=g+str.charAt(j);
//               if(g.length()>1)
//               {
//                   char arr[]=g.toCharArray();
//                   Arrays.sort(arr);
//                   g=String.valueOf(arr);
//                   for(int k=1;k<g.length();k++)
//                   {
//                       char ch=g.charAt(k);
//                       char ch1=g.charAt(k-1);
//                       if(ch1==ch)
//                       {
//                           count++;
//                       }
//                       if(ch1!=ch)
//                       {
//                           continue;
//                       }
//                   }
//                   System.out.println("We can change "+ g + " "+ count+ " times");
//               }
//            }
//            g="";
