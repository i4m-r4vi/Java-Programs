import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value for a :");
        int a = sc.nextInt();
        System.out.print("Enter the Value for b :");
        int b = sc.nextInt();
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        sc.close();
    }
}
