import java.util.Scanner;

public class Program8 {
    public static void Largest(int a,int b,int c) {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        Largest(a, b, c);
    }
}
