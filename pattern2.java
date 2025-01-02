import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Give me the Number:");
        int rows = reader1.nextInt();
        int i,j,z;
        for(i=1;i<=rows;i++){
            for(j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(z=1;z<=2*i-1;z++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        reader1.close();
    }
}
