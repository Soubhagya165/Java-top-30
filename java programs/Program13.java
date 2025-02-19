import java.util.Scanner;
import java.math.*;

public class Program13 {
    public static int Armstrong(int n)
    {
        int count = 0;
        double r = 0;
        int a = n;

        while(n>0)
        {
            n = n/10;
            count++;
        }

        n = a;
        while(n>0)
        {
            int b = n%10;
            r = r+Math.pow(b,count);
            n = n/10;
        }
        int x = (int)r;
        if(x == a)
        {
            System.out.print(a+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Interval : ");
        int m = sc.nextInt();
        System.out.print("Enter 2nd Interval : ");
        int n = sc.nextInt();

        for(int i = m;i<=n;i++)
        {
            Armstrong(i);
        }
    }
}
