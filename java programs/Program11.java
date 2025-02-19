import java.util.Scanner;

public class Program11 {
    public static int Primenumber(int n) {
        int i,j;
        for(i = 1;i<=n;i++)
        {
            for(j = 2;j<=n;j++)
            {
                if(i%j == 0)
                {
                    break;
                }
            }
            if(i == j)
            {
                System.out.print(i+" ");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        Primenumber(n);
    }
}
