import java.util.Scanner;

public class realtional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter The Value for a:");
        a = sc.nextInt();
        System.out.print("Enter The Value for b:");
        b = sc.nextInt();
        System.out.print("Enter The Value for c:");
        c = sc.nextInt();
        if ((a > 2) && (b < 4)) {
            System.out.println("Both conditions are True (a > 2 and b < 4)");
        }

        if ((a < 2) || (b < 4)){
            System.out.println("At least one condition is True (a < 2 or b < 4)");
        }

        if (!(c > 10)) {
            System.out.println("c is not greater than 10");
        }
        sc.close();
    }
}
