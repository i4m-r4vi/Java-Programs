import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give me the Number:");
        int num = reader.nextInt();
        int a=-1,b=1,c=0;
        for(int i=0;i<=num;i++){
            c=a+b;
            System.out.println("The Fibonacci of "+num+" is "+c);
            a=b;
            b=c;
        }
        reader.close();
    }
}
