package zoho;
import java.util.Scanner;
public class StringSort {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scanner.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
            str[i]=scanner.next();
        int i=0;
        while(i<str.length-1){
            for(int j=i+1;j<str.length;j++){
                if(str[i].length()>str[j].length()){
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
            i++;
        }
        i=0;
        /*if("111".compareTo("110")>0)
            System.out.println("true");
        else
            System.out.println("false");
        */    
        while(i<str.length-1){
            int k=i+1;
            while(k<str.length && str[i].length()==str[k].length()){
                if(str[i].compareTo(str[k])>0){
                    String temp=str[i];
                    str[i]=str[k];
                    str[k]=temp;
                }
                k++;
            }
            i++;
        }
        //System.out.println("Two");
        for(int k=0;k<n;k++)
        System.out.print(str[k]+" ");
    }
}
