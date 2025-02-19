import java.util.Scanner;
import java.math.*;

public class Program19 {

    public static double CompoundIntrest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double p = sc.nextInt();
        System.out.print("Enter Rate of Intrest : ");
        double r = sc.nextInt();
        r = r/100;
        System.out.print("Enter Time : ");
        int t = sc.nextInt();
        System.out.print("Enter number of times Compounded : ");
        int n = sc.nextInt();

        double ci = p*Math.pow(1+(r/n),n*t);

        return ci;
    }
    public static void main(String[] args) {
        System.out.println("The Compound Intrest is "+CompoundIntrest());
    }
}
