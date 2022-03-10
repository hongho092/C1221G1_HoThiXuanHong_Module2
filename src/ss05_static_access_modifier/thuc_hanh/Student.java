package ss05_static_access_modifier.thuc_hanh;

public class Student {
    public int rollno;
    private String name;
    public static String college = "BBDIT";

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        this.name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
