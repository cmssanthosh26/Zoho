package arrayproblems;

import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n1=scanner.nextInt();
        int[] array = new int[n1];
        System.out.println("Enter the array elements");
        for(int i=0;i<n1;i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value");
        int v=scanner.nextInt();
        v=v%array.length;
        rotateArray(array,v);
        for(int i=0;i<n1;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void rotateArray(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            int temp=a[0];
            int j=0;
            for(;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[j]=temp;
        }
    }
}
