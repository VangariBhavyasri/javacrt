import java.util.*;
class PrintSubarrOfnElem
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
               
    }
}