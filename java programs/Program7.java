import java.util.Scanner;

public class Program7 {
    public static void Evenodd(int n) {
        if(n%2 == 0)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        Evenodd(x);
    }
}
