import java.util.Scanner;

public class Program23 {
    public static void Pyramid(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k = 1;k<=2*i-1;k++)
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
        Pyramid(x);
    }
}
