import java.util.Scanner;

public class Nestedif6 {
    public static void main(String[] practice){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");
        int n = sc.nextInt();

        if (n > 10 && n <= 15) {
            System.out.println("Number is between 10 to 15");
        } else if (n >= 16 || n <= 20) {
            System.out.println("Number is between 16 to 20");
        } else {
            System.out.println("else part");
        }
    }
}
