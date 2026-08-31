
class person {
    public String name = "Suraj";
    public String Address = "NSK";

    public void showPerson() {
        System.out.println("Person Name -> " + name);
        System.out.println("Person Address -> " + Address);
    }
}

class Teacher extends person {
    public String institue_Name = "DISHA";
    public int contactNumber = 999999;
    public int salary = 8000;

    public void showTeacher() {

        // showPerson();

        System.out.println("institue_Name -> " + institue_Name);
        System.out.println("contactNumber -> " + contactNumber);
        System.out.println("salary -> " + salary);
    }
}

class stud extends person {
    public String Clg_Name = "SITRC";

    public void showStud() {
        System.out.println("Clg Name -> " + Clg_Name);
    }
}

class hirachicalInheritance {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        stud s1 = new stud();

        t1.showPerson();
        t1.showTeacher();

        s1.showStud();
    }
}