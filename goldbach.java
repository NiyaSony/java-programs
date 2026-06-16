import java.util.*;
public class goldbach
{
    Scanner sc = new Scanner(System.in);
    int N;
    
    public void main()
    {
        System.out.print("INPUT : N = ");
        N=sc.nextInt();
        
        if(N<9||N>50)
        {
            System.out.println("INVALID INPUT. SIZE OUT OF RANGE");
            return;
        }
        if(N%2!=0)
        {
           System.out.println("INVALID INPUT. NUMBER IS ODD");
            return; 
        }
        primepair(N);
        
    }
    public void primepair(int x)
    {
        System.out.print("PRIME PAIRS ARE : ");
        int j=0;
        
        for(int i=1;i<=(x/2);i++)
        {
            j=x-i;
            if(i%2!=0 && j%2!=0)
            if(prime(j)==true&&prime(i)==true)
            {
                System.out.println(i+","+j);
                
            }
            
        }
    }
    public boolean prime(int x)
    {
        int f=0;
        for(int i=1;i<=(x/2);i++)
        {
            if(x%i==0)
        f++;
        
    }
    if(f==1)
    return true;
    else
    return  false;
 }
}