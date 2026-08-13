import java.util.function.Function;

public class Function2 {
    // 3. Function with parameter and display DATA(no return value)
    public static void displayData(String username, int id) {
        System.out.println("hello " + username + ", id -->" + id);
    }

    // 2. Function no parameter and display DATA
    public static void msg() {
        System.out.println("Hello SIR...");
        
    }
    public static void main(String[] args) {
        displayData("parth", 1001);
        displayData("suraj", 1002);

        for(int i=1; i<=5; i++){
            msg();
        }
        
    }
}
