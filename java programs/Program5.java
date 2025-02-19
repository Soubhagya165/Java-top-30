import java.util.Scanner;

public class Program5 {
    public static String Binary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int x = sc.nextInt();
        System.out.print("Enter another Number : ");
        int y = sc.nextInt();
        

        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);

        System.out.println("The Binary String of "+x+ " = "+ a);
        System.out.println("The Binary String of "+y+ " = "+ b);

        int z = x+y;
        String c = Integer.toBinaryString(z);

        return c;
    }
    public static void main(String[] args) {
        System.out.println("The Addition of binary Strings Are : "+Binary());
    }
}
