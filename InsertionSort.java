import java.util.*;
class InsertionSort{
static void insertionSort(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
int j=i-1;
while(j>0 && a[j]<a[j-1])
{
int t=a[j];
a[j]=a[j-1];
j--;
}
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
insertionSort(a,n);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}
