package ss20_solid.liskov.demo1_not;

public class Employee {
    private int id;
    private String name;
    private int age;
    public void working(){
        System.out.println("nhân viên làm việc");
    }
    public void checkAttendance(){
        System.out.println("chấm công nhân viên");
    }
}
