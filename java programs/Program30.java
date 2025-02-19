import java.util.Scanner;

public class Program30 {
    public static void Diamond(int n)
    {
        int nst = 1;
        int nsp = n/2;
        int ml = n/2+1;
        for(int i = 1;i<=n;i++)
        {

            for(int j = 1;j<=nsp;j++)
            {
                System.out.print("  ");
            }
            for(int k = 1;k<=nst;k++)
            {
                System.out.print("* ");
            }
            if(i<ml)
            {
                nst += 2;
                nsp--;
            }
            else
            {
                nst -= 2;
                nsp++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        Diamond(x);
    }
}
