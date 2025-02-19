import java.util.Scanner;

public class Program15 {
    public static void Vowel(char c) 
    {
        int x = (int)c;
        if(x == 65 || x == 69 || x == 73 || x == 79 || x == 85 || x == 97 || x == 101 || x == 105 || x == 111 || x == 117)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);
        Vowel(ch);
    }
}
