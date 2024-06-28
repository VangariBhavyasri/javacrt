/*print index of searching element from 1st at which index there is searching element &from last at which index is the searching element,if not present print -1 -1*/
import java.util.*;
class Print2Indexes{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int k=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int c=0;
for(int i=0;i<n;i++)
{
if(k==a[i])
{
System.out.print(i+" ");
break;
}
}
for(int i=n-1;i>0;i--)
{
if(k==a[i])
{
System.out.print(i+" ");
break;
}
}
if(c==1)
{
System.out.print("-1  -1");  
}
}
}




