import java.util.Scanner;

public class Program20 {

    public static int Perimeter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of the Rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of the Rectangle : ");
        int breadth = sc.nextInt();

        int perimeter = 2*(length+breadth);
        return perimeter;
    }
    public static void main(String[] args) {
        System.out.println("The Perimeter of the Rectangle is "+Perimeter());
    }
}
