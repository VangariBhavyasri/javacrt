import java.util.*;//right rotation
class UpdateArrayRot2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        int k=s.nextInt();
        for(int r=0;r<k;r++)
        {
            int t=a[n-1];
            for(i=n-1;i>0;i--)
            {
            a[i]=a[i-1];
            }
            a[i]=t;
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}