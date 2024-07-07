import java.util.*;
class ArrEqSum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i; 
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int ls=0;
        for(i=0;i<n-1;i++)
        {
        int rs=0;
            ls=ls+a[i];
            for(int j=i+1;j<n;j++)
        {
            rs=rs+a[j];
        }
        if(ls==rs)
        {
            for(int k=0;k<=i;k++)
            System.out.print(a[k]+" ");
            System.out.println();
            for(int k=i+1;k<n;k++)
            System.out.print(a[k]+" ");
            break;
        }
        }
        if(i==n-1)
        System.out.println("Not possible");
    }
}