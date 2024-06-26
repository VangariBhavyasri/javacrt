import java.util.*;
class FibSer
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int i,n,r1=0,r2=1,r3;
n=s.nextInt();
System.out.println(r1);
System.out.println(r2);
for(i=1;i<=n-2;i++)
{
r3=r1+r2;
System.out.println(r3);
r1=r2;
r2=r3;
}
}
}




