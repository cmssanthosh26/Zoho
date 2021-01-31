package zoho;
import java.util.Scanner;
public class NumberToWord 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String[] tens={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        String[] hundreds={"","One hundred","Two hundred","Three hundred","Four hundred","Five hundred","Six hundred","Seven hundred","Eight hundred","Nine hundred"};
        System.out.println("Enter the value");
        int n=scanner.nextInt();
        if(n==0)
            System.out.println("Zero");
        else if(n<=19)
            System.out.println(ones[n]);
        else if(n<=99)
            System.out.println(tens[n/10]+" "+ones[n%10]);
        else
        {
            System.out.print(hundreds[n/100]+" and ");
            if(n%100>19){
                System.out.println(tens[(n%100)/10]+" "+ones[(n%100)%10]);
            }
            else
                System.out.println(ones[(n%100)]);
        }
    }
}
