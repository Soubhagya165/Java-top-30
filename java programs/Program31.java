import java.util.Scanner;

public class Program31 {
    public static void Square(int n) 
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
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
        Square(x);
    }
}
