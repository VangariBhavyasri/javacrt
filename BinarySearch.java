import java.util.*;
class BinarySearch{
static int binarySearch(int a[],int low,int high,int key)
{
while(low<=high)
{
int mid=(low+high)/2;
if(a[mid]==key)
return mid;
else if(a[mid]>key)
high=mid-1;
else
low=mid+1;
}
return -1;
}
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int key=s.nextInt();
Arrays.sort(a);
int r=binarySearch(a,0,n-1,key);
if(r==1)
{
System.out.println("element is not found");
}
else
{
System.out.println("element is found "+r);
}
}
}



