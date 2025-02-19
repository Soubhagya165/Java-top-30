import java.util.Scanner;

public class Program3 {
    public float Multiply(float x,float y) {
        return x*y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Float : ");
        float a = sc.nextFloat();
        System.out.print("Enter another Float : ");
        float b = sc.nextFloat();

        Program3 obj = new Program3();
        System.out.print("The Multiplication of "+ a +" and "+b+" is "+obj.Multiply(a, b));
    }
}
