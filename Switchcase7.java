import java.util.Scanner;

public class Switchcase7 {
    public static void main(String[] practice){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");
        int n = sc.nextInt();

        switch(n)
        {
            case 20:
                System.out.println("Number is present ");
                break;
            case 30:
                System.out.println("Number is present");
                break;
            case 40:
                System.out.println("Number is present");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}

