import java.util.*;        
class MaxOfSubarraySum
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
         int max=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+a[k];
                }
                if(max<sum)
                max=sum;
               
            }
        }
         System.out.println(max);
    }
}