import java.util.Scanner;

public class Program10 {
    public static int GCD(int a,int b) {
        while(b>0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();

        System.out.println("The HCF of "+a+" and "+b+" is "+GCD(a, b));
    }
}
