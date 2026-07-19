import java.util.Scanner;

public class IfelsepracticeQ {
    public static void main(String[] practice){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any password");
        String password = sc.nextLine();

        if(password.equals("Disha")) {
            System.out.println("login");
        } else {
            System.out.println("invalid pass.");
        }
    }
}
