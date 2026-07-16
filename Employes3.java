import java.util.Scanner;
//types of input taken to user
public class Employes3 {
    public static void main(String[] args){

        // class_name obj_name = new class_name();
        Scanner parth = new Scanner(System.in);

        System.out.println("enter employe name");
        String name = parth.nextLine();

        System.out.println("enter employe Id");
        int Id = parth.nextInt();

        System.out.println("enter employe salary");
        int salary = parth.nextInt();

        System.out.println("enter employe role");
        String role = parth.next();

        System.out.println(" My name is " + name);
        System.out.println(" My name is " + Id);
        System.out.println(" My name is " + salary);
        System.out.println(" My name is " + role);
    }
}
