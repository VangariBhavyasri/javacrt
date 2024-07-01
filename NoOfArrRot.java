import java.util.*;
class NoOfArrRot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        int r=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<a[i+1])
            continue;
            else
            {
                r=i+1;
                break;
            }
        }
        System.out.print(r);
    }
}