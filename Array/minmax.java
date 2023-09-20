import java.util.*;
class min_max
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]= sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[0]);
            System.out.println(a[n-1]);
        }
    }
}
