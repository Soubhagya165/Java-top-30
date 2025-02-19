import java.util.Scanner;

public class Program27 {
    public static void Downward(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n+1-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series : ");
        int x = sc.nextInt();
        Downward(x);
    }
}
