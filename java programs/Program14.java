import java.util.Scanner;

public class Program14 {
    public static void Neonnumber(int n) {
        int a = n;
        int square = n*n;
        int r = 0;

        while(square > 0)
        {
            int b = square%10;
            r = r+b;
            square = square/10;
        }
        if(r == a)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not a Neon Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        Neonnumber(x);
    }
}
