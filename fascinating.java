import java.util.*;
public class fascinating
{ int m,n;
    Scanner sc = new Scanner (System.in);
    public void main()
    { int c=0;
        System.out.print("INPUT M = ");
        m=sc.nextInt();
        System.out.print("INPUT N = ");
        n=sc.nextInt();
        
        if(m<99||m>10000||n<99||n>10000)
        System.out.println("INVALID INPUT");
        else
        {System.out.println("THE FACSINATING NUMBERS ARE = ");
            
            for(int i=m;i<=n;i++)
            {
                boolean b= isfasc(i);
                if(b==true)
                {
                    System.out.print(i+" ");
                    c++;
                }
                
            }
            
            if(c==0)
            System.out.print("NIL");
            System.out.println();
            System.out.println("FREQUENCY = "+c);
            
        }
    }
    
    public boolean isfasc(int x)
    {
        boolean found=true;
        int f=0;
        String str=x+""+(x*2)+(x*3);
        for(char i ='1';i<='9';i++)
        {f=0;
            for(int j=0;j<str.length();j++)
            {
              char ch =str.charAt(j);
              if(ch==i)
              {
                  f++;
              }
            }
            if(f==0||f>1)
            {
                found=false;
                break;
            }
        }
        if(found==true)
        return true;
        else
        return false;
    }
    
}
