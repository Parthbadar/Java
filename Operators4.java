public class Operators4 {
    public static void main(String[] args){
        int n1 = 4;
        int n2 = 4;

        System.out.println("***************** Arithmatic operator**********");
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));


        System.out.println("***************** Relational operator**********");
        System.out.println(n1 + " != " + n2 + " = " + (n1!=n2));
        System.out.println(n1 + " == " + n2 + " = " + (n1==n2));
        System.out.println(n1 + " < " + n2 + " = " + (n1<n2));
        System.out.println(n1 + " > " + n2 + " = " + (n1>n2));
        System.out.println(n1 + " <= " + n2 + " = " + (n1<=n2));
        System.out.println(n1 + " >= " + n2 + " = " + (n1>=n2));

        System.out.println("***************** Logical operator**********");
        //  &&
        //  ||
        //  !

        boolean b1 = false;
        boolean b2 = false;

        System.out.println("AND operation -> " + (b1&&b2));
        System.out.println("AND operation -> " + (b1||b2));

        System.out.println(" Not (AND)  operation -> " + ! ((b1&&b2)));
        System.out.println(" Not (or)  operation -> " + ! ((b1||b2)));


        System.out.println("***************** Assignment operator (+=, -=,*=,/=)**********");

        int x = 10;
        System.out.println("The value of X ->" + x);
        x += 3; // 13
        x *= 2; // 13 * 2 = 26
        System.out.println("The value of X ->" + x);

        System.out.println("***************** bitwise operator**********");
        int s1 = 5;
        int s2 = 3;
        int s3 = 4;

        System.out.println(s1&s2);
        System.out.println(s1|s2);
        System.out.println(s1^s2);

        System.out.println(s1 & s2 & s3);
        System.out.println(s1 | s2 | s3);
        System.out.println(s1 ^ s2 ^ s3);

    }
}
