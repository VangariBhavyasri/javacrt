import java.util.*;
class ZeroesToEnd
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int j=0;
for(int i=0;i<n;i++)
{
if(a[i]!=0)
a[j++]=a[i];
}
while(j<n)
{
a[j++]=0;
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
