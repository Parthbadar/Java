    class student {
    public String Name = "";
    public int rollno;

    public student() {
    }

    public student(String studName, int studRn) {
        Name = studName;
        rollno = studRn;
    }

    public student(student stud) {
        this.Name = stud.Name;
        this.rollno = stud.rollno;
    }

    public void showStudent() {
        System.out.println("Student name -> " + Name);
        System.out.println("Student rollno -> " + rollno);
    }
    }

public class CopyConstructor{
    public static void main(String[] args) {

        student s1 = new student("Parth", 21);
        student s2 = new student(s1);

        s1.showStudent();

        s2.showStudent();
    }
}

