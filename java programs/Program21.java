import java.util.Scanner;

public class Program21 {
    public static void RightTriangle(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Series : ");
        int x = sc.nextInt();
        RightTriangle(x);
    }
}
