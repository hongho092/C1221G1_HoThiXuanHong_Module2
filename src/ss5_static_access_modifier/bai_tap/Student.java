package ss5_static_access_modifier.bai_tap;

public class Student {
    private String name = "John";
    private String clas = "C12";

    public Student (){

    }

    protected void  setName(String name) {
        this.name = name;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clas='" + clas + '\'' +
                '}';
    }
}
