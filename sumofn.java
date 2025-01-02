import java.util.Scanner;

public class sumofn {
    public int oddEven(int num) {
        if (num % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int num = reader.nextInt();
        int odd =0;
        int even =0;
        oddoreven myobj = new oddoreven();
        for (int i = num; i >= 1; i--) {
            if (myobj.oddEven(i) == 1) {
                even+=i;
            } else {
                odd+=i;
            }
        }
        System.out.print("The Sum of odd: "+odd);
        System.out.println("");
        System.out.print("The Sum of even: "+even);
        reader.close();

    }
}
