import java.util.Scanner;

public class Program25 {
    public static void Upperstar(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++)
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
        Upperstar(x);
    }
}
