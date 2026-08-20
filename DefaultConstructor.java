class memory {
    public void normalFunction()
    {
        System.out.println("Hello I'M normal function");
    }

    public memory() {
        System.out.println("Memory Allocated (special Function calling)");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        memory m1 = new memory();
        memory m2 = new memory();
        memory m3 = new memory();

        m1.normalFunction();
    }
    
}
