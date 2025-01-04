import java.util.Scanner;

public class calculations {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for a:");
        int a= sc.nextInt();
        System.out.print("Enter a value for b:");
        int b = sc.nextInt();
        int sum,sub,mul,div,mod;
        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;
        System.out.println("The Sum is : "+sum);
        System.out.println("The Sub is : "+sub);
        System.out.println("The Multiply is : "+mul);
        System.out.println("The Divide is : "+div);
        System.out.println("The Mod is : "+mod);
        sc.close();
    }
}