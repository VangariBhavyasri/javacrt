import java.util.*;
class ArrayListCount{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
Integer n=s.nextInt();
Integer a[]=new Integer[n];
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
for(Integer x:a1)
{
if(!(a2.contains(x)))
a2.add(x);
}
System.out.println(a2);
int c=0;
for(Integer x:a2)
{
c=0;
for(Integer r:a1)
{
if(x==r)
c++;
}
System.out.println(x+" "+c);
}
}
}