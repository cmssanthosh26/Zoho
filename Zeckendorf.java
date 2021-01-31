package zoho;
import java.util.Scanner;
import java.util.Stack;
public class Zeckendorf {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack=new Stack<Integer>();
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        int f1=1,f2=1;
        while(f1<=n){
            stack.push(f1);
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(stack);
        while(!stack.empty() && n>0){
            int v=stack.pop();
            if(v<=n){
                System.out.print(v+" ");
                n-=v;
            }
        }
    }
}
