//merge 2 arrays and after merging print in sorted way
import java.util.*;
class MergeArrSort{ 
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
//here we will take 2 diff array sizes bcoz we cant determine both arrays have same size(m,n)
int m=s.nextInt();
int a[]=new int[m];
for(int i=0;i<m;i++)
{
a[i]=s.nextInt();
}
int n=s.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=s.nextInt();
}
int c[]=new int[m+n];
int i=0,j=0,k=0;
while(i<m&&j<n)
{
if(a[i]<b[j])
{
c[k]=a[i];
k++;
i++;
}
else
{
c[k]=b[j];
k++;
j++;
}
}
while(i<m)
{
c[k]=a[i];
k++;
i++;
}
while(j<n)
{
c[k]=b[j];
k++;
j++;
}
for(i=0;i<k;i++)
{
System.out.print(c[i]+" ");
}
}
}






