public class Recursion {
    public static int fact(int n) {
        if(n < 2) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("5 Factorial  Number --->" + fact(5));
        
    }
}
