package DAY_5.Assignment1;

import java.util.Scanner;

public class Q5
{
    public static  void permute(char[] ar, int fi){
        if(fi==ar.length-1){
            System.out.println(ar);
            return;
        }
        for(int i = fi ;i<ar.length ;i++)
        {
            swap (ar,i,fi);
            permute(ar , fi+1);
            swap(ar,i,fi);
        }
    }
    static  void swap(char[] ar ,int i , int fi){
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.next();
        permute(str.toCharArray(), 0);
    }
}
