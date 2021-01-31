package zoho;
import java.util.Scanner;
public class Zoho {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(j>=i){
                    System.out.print(j+" ");
                    continue;
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
