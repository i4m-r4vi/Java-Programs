import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        original = reader.nextLine().toLowerCase();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It isn't a palindrome.");
            reader.close();
        }

    }

}
