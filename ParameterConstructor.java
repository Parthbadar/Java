class student {
    public String Name = "";
    public int rollno;

    public student(){}

    public student(String studName, int studRn)
    {
        Name = studName;
        rollno = studRn;
    }

    public void showStudent() {
        System.out.println("Student name ->" + Name);
        System.out.println("Student rollno ->" + rollno);
    }
}

public class ParameterConstructor {
    public static void main(String[] args) {
        student s1 = new student("parth",21);
        student s2 = new student();

        s1.showStudent();
    }
}
