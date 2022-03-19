package ss17_IO_binary_file.thuc_hanh.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static ss17_IO_binary_file.thuc_hanh.students.WriteReadStudent.readDataFromFile;
import static ss17_IO_binary_file.thuc_hanh.students.WriteReadStudent.writeToFile;

public class TestStudent {
    private static final String FILE_WRITE = "src/ss17_IO_binary_file/thuc_hanh/students/Student.txt";
    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add (new Student(1,"nguyen a", "DHNN"));
//        studentList.add (new Student(2,"nguyen b", "DHNN"));
//        studentList.add(new Student(3,"nguyen c", "DHNN"));
//        studentList.add(new Student(4,"nguyen d", "DHNN"));
//        studentList.add(new Student(5,"nguyen e", "DHNN"));
//
//        writeToFile(FILE_WRITE, studentList);
//
//        List<Student> studentDataFromFile = readDataFromFile(FILE_WRITE);
//        for (Student student : studentDataFromFile) {
//            System.out.println(student);
//        }

        Set<Student> students = new TreeSet<>();
        Student student1 = new Student(2,"nguyen b", "DHNN");
        students.add(student1);
        Student student2 = new Student(1,"nguyen a", "DHNN");
        students.add(student2);
        for (Student student : students) {
            System.out.println(student);
        }

//        Set<Integer> list = new TreeSet<>();
//        list.add(3);
//        list.add(8);
//        list.add(6);
//        list.add(12);
//        list.add(8);
//        System.out.println(list);
//
//        Set<String> list1 = new TreeSet<>();
//        list1.add("o");
//        list1.add("ha");
//        list1.add("yo");
//        list1.add("yo");
//        list1.add("ma");
//        list1.add("su");
//        System.out.println(list1);
    }
}
