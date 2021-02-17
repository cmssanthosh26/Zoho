package arrayproblems;

import java.util.Scanner;

public class ArrayReverse {
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
        reverseArray(array);
        for(int i=0;i<n1;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void reverseArray(int[] a)
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
