class emp {
    public String name;
    public int id;

    public void setEmp(String eName, int eid) {
        name = eName;
        id = eid;
    }

    public void showEmp() {
        System.out.println("Emp Name : " + name);
        System.out.println("Emp id : " + id);
    }
}

class programmer extends emp {
    public String Designation;
    public int salary;

    public void setProg(String pDesig, int pSal) {
        Designation = pDesig;
        salary = pSal;
    }

    public void showProgrammer() {
        System.out.println("Programmer Designation -> " + Designation);
        System.out.println("Programmer salary -> " + salary);
    }
}

class singleInheritance {
    public static void main(String[] args) {

        programmer p1 = new programmer();

        p1.setEmp("Parth", 1001);
        p1.setProg("FE", 1000);

        p1.showEmp();
        p1.showProgrammer();
    }
}
