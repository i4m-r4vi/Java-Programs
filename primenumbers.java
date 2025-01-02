import java.util.Scanner;

public class primenumbers {
    boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i=2;i<num;i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a value:");
        int num =  reader.nextInt();
        primenumbers prime = new primenumbers();
        if (prime.prime(num)) {
            System.out.println("The Given Number is Prime Number");
        }else{
            System.out.print("The Given Number is not a Prime Number");
        }
        reader.close();
    }
}
