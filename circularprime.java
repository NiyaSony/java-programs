import java.util.*;
public class circularprime
{
   int N;
   Scanner sc = new Scanner(System.in);
   
   
   public void main()
    {
        System.out.print("INPUT : \nN = ");
        N=sc.nextInt();
        String st=""+N;
        int l=st.length();
        String s =""+st;
        int val=1;
        boolean b= true;
        System.out.println("OUTPUT :\n"+st);
        
        while(l>1)
        {
            s=s.substring(1)+s.charAt(0);
            l--;
            val=Integer.valueOf(s);
            b=prime(val);
            System.out.println(val);
        }
        if(b==true)
        System.out.println(st+" IS A CIRCULAR PRIME");
        else
        System.out.println(st+" IS NOT A CIRCULAR PRIME");
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
        return false;
    }
}
