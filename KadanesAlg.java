import java.util.*;
class KadanesAlg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            
        }
         int gs=a[0],cs=0;
        for(i=0;i<n;i++)
        {
           cs=cs+a[i];
           if(gs<cs)
           gs=cs;
           if(cs<0)
           cs=0;
        }
        System.out.println(gs);
    }
}
                    
                    
                    
             