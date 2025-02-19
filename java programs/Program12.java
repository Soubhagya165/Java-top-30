import java.util.Scanner;

public class Program12 {
    public static void Leapyear(int year)
    {
        if(year % 400 == 0)
        {
            System.out.print("Leap Year");
        }
        else if(year % 100 == 0)
        {
            System.out.print("Not a Leap Year");
        }
        else if(year %4 == 0)
        {
            System.out.print("Leap Year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();
        Leapyear(year);
    }
}
