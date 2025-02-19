import java.util.Scanner;

public class Program2 {

    public void Userinput(String str) {
        System.out.print("The String is : "+str);
    }
    public static void main(String[] args) {
        Program2 obj = new Program2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        obj.Userinput(str);
    }
}