package stringproblems;
public class CharacterCount 
{
    
    class CharacterValue
    {
        char n;
        int count;
    }
    
    int n;
    int m;
    CharacterValue[] v;
    
    CharacterCount(int n)
    {
        this.n=n;
        this.v=new CharacterValue[this.n];
        this.m=0;
    }
    
    void extractCharacter(String n)
    {
        for(int i=0;i<n.length();i++)
        {
            char r=n.charAt(i);
            int k=0;
            int flag=0;
            while(k < m)
            {
                if(v[k].n == r)
                {
                    v[k].count++;
                    flag=1;
                    break;
                }
                k++;
            }
            if(flag==0)
            {
                CharacterValue c = new CharacterValue();
                c.count=1;
                c.n=r;
                v[m++]=c;
            }
        }
    }
    
    void display()
    {
        for(int i=0;i<this.m;i++)
        {
            CharacterValue c =v[i];
            System.out.println(c.n +"  "+c.count);
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        String name = "gopi";
        CharacterCount c=new CharacterCount(name.length());
        c.extractCharacter(name);
        c.display();
    }
}
