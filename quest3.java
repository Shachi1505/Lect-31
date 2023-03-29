import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the decimal no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        convert(n); // calling the function
    }

    public static void convert(int n) {
        if (n != 0) {
            int r = n % 2;
            convert(n / 2); // recursion
           // Decimal value:
            System.out.println(r); 
          // Printing the remainder which gives binary didgits as answer.
        }
    }
}
