
    import java.util.Scanner;
public class program6 {
    public static void Complex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st real number : ");
        double real1 = sc.nextDouble();
        System.out.print("Enter 1st imaginary number : ");
        double imaginary1 = sc.nextDouble();

        System.out.println("The 1st Complex number is : "+real1+"+"+imaginary1+"i");

        System.out.print("Enter 2nd real number : ");
        double real2 = sc.nextDouble();
        System.out.print("Enter 2nd imaginary number : ");
        double imaginary2 = sc.nextDouble();

        System.out.println("The 2nd Complex number is : "+real2+"+"+imaginary2+"i");

        double i = real1+real2;
        double j = imaginary1+imaginary2;

        System.out.print("The addition is : "+i+"+"+j+"i");

    }
    public static void main(String[] args) {
        Complex();
    }
    
}


