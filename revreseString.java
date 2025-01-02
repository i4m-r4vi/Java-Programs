import java.util.Scanner;

public class revreseString {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        original = reader.nextLine().toLowerCase();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.print("The Reverse:"+reverse);
        reader.close();
    }
}
