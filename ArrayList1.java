import java.util.*;
class ArrayList1{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
ArrayList<Integer> a1= new ArrayList<>();

for(int i=0;i<n;i++)
{
a1.add(a[i]);
}
ArrayList <Integer> a2= new ArrayList<>();
for(int x:a1)
{
if(!(a2.contains(x)))
a2.add(x);
}
System.out.println(a2);
Integer b[]=new Integer[a2.size()];
a2.toArray(b);
for(int i=0;i<b.length;i++)
{
System.out.print(b[i]+" ");
}
}
}