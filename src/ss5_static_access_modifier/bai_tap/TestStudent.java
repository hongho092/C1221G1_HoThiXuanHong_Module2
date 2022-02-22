package ss5_static_access_modifier.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1);

        stu1.setClas("C10");
        stu1.setName("Adam");
        System.out.println(stu1);
    }
}
