import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        System.out.print("Give me the Number:");
        int num = reader1.nextInt();
        int i,j,z;
        int count=1;
        for(i=num;i>0;i--){
            for(j=i;j>0;j--)
                System.out.print(" ");
            
            for(z=0;z<num;z++)
                System.out.print("*");
            
            System.out.print("\n");
            count+=2;
        }
        reader1.close();
    }
}
