import java.util.Scanner;

public class Program9 {

    public static int LCM(int a,int c,int d) 
    {
        int lcm = c*d/a;
        return lcm;
    }

    public static int GCD(int a,int b)
    {
        int c = a;
        int d = b;
        while(b>0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return LCM(a,c,d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter another number : ");
        int b = sc.nextInt();
        System.out.println("The LCM of "+a+" and "+b+" is "+GCD(a, b));
    }
}
