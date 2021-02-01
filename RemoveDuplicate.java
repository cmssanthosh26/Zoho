package zoho;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=s.nextInt();
        int[] array=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            int value=s.nextInt();
            int k=0,flag=0;
            while(k<count){
                if(array[k++]==value){
                    flag=1;
                    break;
                }    
            }
            if(flag==0)
                array[count++]=value;
        }
        for(int i=0;i<count;i++)
            System.out.print(array[i]+" ");
    }
}
