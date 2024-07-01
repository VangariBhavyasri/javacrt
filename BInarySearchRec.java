import java.util.*;
        class BinarySearchRec{ //binary search using recursion
static int binarySearch(int a[],int low,int high,int key)
{
if(low<=high)
{
int mid=(low+high)/2;
if(a[mid]==key)
return mid;
else if(a[mid]>key)
return binarySearch(a,low,mid-1,key);
else
return binarySearch(a,mid+1,high,key);
}
else
{
return -1;
}
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
if(r==-1)
{
System.out.println("element is not found");
}
else
{
System.out.println("element is found "+r);
}
}
}