package arrayproblems;

import java.util.Scanner;

public class Arithemic {
    public static void main(String[] args)
    {
        int start=5,diff=2;
        Scanner scanner = new Scanner(System.in);
        int length=scanner.nextInt();
        int[] array = new int[length];
        apSeries(start,diff,array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void apSeries(int start,int diff,int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=start + i*diff;
        }
    }
}
