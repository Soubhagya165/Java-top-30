import java.util.Scanner;

public class Program17 {
    public static int Fibonacci(int n) 
    {
        int a = 0;
        int b = 1;
        int next;
        int sum = 0;

        for(int i = 2;i<n;i++)
        {
                next = a+b;
                a = b;
                b = next;
            if(i%2 == 0)
            {
                sum += next;
            }
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum is "+ Fibonacci(n));

    }
}
