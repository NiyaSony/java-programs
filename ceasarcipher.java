import java.util.*;
public class ceasarcipher
{
    String st="";
    Scanner sc= new Scanner(System.in);
    String s="";
    public void main()
    {
        System.out.print("INPUT : ");
        st=sc.nextLine();
        int L=st.length();
        if(L<=3||L>100)
        {
            System.out.println("INVALID LENGTH");
            return;
        }
         System.out.println("OUTPUT: The cipher text is : ");
         for(int i=0;i<L;i++)
         {
             encrypt(st.charAt(i));
         }
           System.out.println(s);
    }
    public void encrypt(char ch)
    {
            if((ch>='a'&&ch<='m')||(ch>='A'&&ch<='M'))
            {
                s=s+(char)(ch+13);
            }
            else if((ch>='n'&&ch<='z')||(ch>='N'&&ch<='Z'))
            s=s+(char)(ch-13);
        
            else
            s=s+ch;
    }
}
