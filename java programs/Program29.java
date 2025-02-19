import java.util.Scanner;

public class Program29 {
    public static void Pascal(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n-i+1;j++)
            {
                System.out.print(" ");
            }
            int value = 1;
            for(int k = 1;k<=i;k++)
            {
                System.out.print(value+" ");
                value = value * (i-k)/k;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        Pascal(x);
    }
}
