
// 1. if else statement 
// 2. nested if else statement
// 3. switch case

// if (condition){
//     true block of code 
// }
// else{
//     false block of code
// }

import java.util.Scanner;

public class Ifelse5 {
    public static void main(String[] parth){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int n = sc.nextInt();

        if(n>90){
            System.out.println("I phone Bhetel");
        }
        else{
            System.out.println("nokia dabba Bhetel");
        }
    }
}
