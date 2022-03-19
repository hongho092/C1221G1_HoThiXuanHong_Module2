package ss10_array_linked_list.thuc_hanh.list_simple;

import java.util.Objects;

public class Student implements Comparable<Student>{
    public int id;
    public String name;
    public String nameSchool;

    public Student(int id, String name, String nameSchool) {
        this.id = id;
        this.name = name;
        this.nameSchool = nameSchool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 12;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return this.getId() == student.getId() &&
                this.name.equals(student.name);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
