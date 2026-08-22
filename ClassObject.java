class person{
    public int id;
    public String name;
    public String address;

    public void setData(int pId, String pName, String pAddress){
        id = pId;
        name = pName;
        address = pAddress;
    }

    public void showData(){
        System.out.println("Student name =" + name);
        System.out.println("Student id = " + id);
        System.out.println("Student address = " + address);
    }
};
public class ClassObject{
    public static void main(String[] args) {
        person p1 = new person();
        p1.setData(1001, "Sarthak", "NSK");

        person p2 = new person();
        p2.setData(1002, "Parth", "NSK");

        p1.showData();
        p2.showData();
        
        
    }
}

