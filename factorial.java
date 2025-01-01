import java.util.Scanner;

public class factorial {
    public int fact(int num){
        if (num==0 || num==1) {
            return 1;
        }else{
            return num * fact(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int num = reader.nextInt();
        factorial myFact = new factorial();
        int theNumber = myFact.fact(num);
        System.out.println("The Factorial of "+num+" is "+theNumber);
        reader.close();
    }
}
