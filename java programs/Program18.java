import java.util.Scanner;

public class Program18 {
    public static double SimpleIntrest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of Intrest : ");
        int r = sc.nextInt();
        System.out.print("Enter Time : ");
        int t = sc.nextInt();

        double si = p*t*r/100;

        return si;
    }
    public static void main(String[] args) {
        System.out.println("The Simple Intrest is "+SimpleIntrest());
    }
}
