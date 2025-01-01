import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give me the Number:");
        int num = reader.nextInt();
        int i,j;
        for(i=0;i<num;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
