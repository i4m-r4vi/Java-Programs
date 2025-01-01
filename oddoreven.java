import java.util.Scanner;

public class oddoreven {
    public int oddEven(int num){
        if(num%2==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int num = reader.nextInt();
        oddoreven myobj = new oddoreven();
        for(int i=num;i>=1;i--){
            if (myobj.oddEven(i)==1) {
                System.out.println("Even Numbers:"+i);
            }else{
                System.out.println("Odd Numbers:"+i);
            }
        }
        reader.close();
    }
}
