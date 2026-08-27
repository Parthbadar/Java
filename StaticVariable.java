
class student {
    public String Name = "";
    public int rollno;
    static public int count = 0;

    public student() {
    }

    public student(String studName, int studRn) {
        Name = studName;
        rollno = studRn;
        count += 1;

        // count = 1
        // count = 2
        // count = 3
    }

    // public student(student stud){
    //     this.Name = stud.Name;
    //     this.rollno = stud.rollno;
    //
    // }

    public void showStudent() {
        System.out.println("Student name -> " + Name);
        System.out.println("Student rollno -> " + rollno);

        System.out.println();
    }
}

class StaticVariable {
    public static void main(String[] args) {

        student s1 = new student("Parth", 21);
        student s2 = new student("Sumit", 21);
        student s3 = new student("Sarthak", 20);

        // student s2 = new student(s1);

        s1.showStudent();
        s2.showStudent();
        s3.showStudent();

        System.out.println("Total Number of student -> " + s3.count);

        // s2.showStudent();
    }
}
