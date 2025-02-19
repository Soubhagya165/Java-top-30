import java.util.Scanner;

public class Program26 {
    public static void Mirrorupperstar(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=n+1-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        Mirrorupperstar(x);
    }
}
