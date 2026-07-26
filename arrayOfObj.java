
import java.util.Scanner;

class emp{
    public String name = "";
    public int id = 0;

    public void set(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter emp Name: ");
        name = sc.next();

        System.out.println("Enter emp id: ");
        id = sc.nextInt();
    }

    public void show(){
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);

    }
};


public class arrayOfObj {
  public static void main(String[] args) {
    emp [] e1 = new emp[2];

    // e1[0] -> name, id
    // e1[1] -> name, id
    // e1[2] -> name, id
    // e1[3] -> name, id
    // e1[4] -> name, id

    for(int i = 0; i<e1.length; i+=1){
        e1[i] = new emp();
        e1[i].set();

        System.out.println();
    }
    
    for(int i = 0; i<e1.length; i+=1){
        e1[i].show();
        System.out.println();
    }


  }  
}
