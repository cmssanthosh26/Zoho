package stringproblems;
public class factor {
    public static void main(String[] args)
    {
        int[] arrayElements ={5,10,20,30};
        
        int[] factor = findFactor(arrayElements);
        
        sort(arrayElements,factor);
        
        for(int i=0;i < factor.length;i++)
        {
            System.out.print(arrayElements[i]+"  ");
            System.out.println(factor[i]);
        }
        
    }
    
    public static int[] findFactor(int[] arrayElement)
    {
        int[] factor = new int[arrayElement.length];
        
        for(int start = 0 ; start < arrayElement.length; start++)
        {
            int value = arrayElement[start];
            int count = 1;
            for(int i=2;i <= value/2;i++)
            {
                if(value%i == 0)
                {
                    count++;
                }
            }
            count++;
            factor[start] = count;
        }
        return factor;
    }
    
    public static void sort(int[] arrayElements,int[] factor)
    {
        for(int start=0; start < factor.length-1; start++)
        {
            for(int j=0; j<factor.length-1-start; j++)
            {
                if(factor[j] > factor[j+1])
                {
                    int temp = factor[j];
                    factor[j] = factor[j+1];
                    factor[j+1] = temp;
                    
                    int value = arrayElements[j];
                    arrayElements[j] = arrayElements[j+1];
                    arrayElements[j+1] = value;
                }
            }
        }
    }
}
