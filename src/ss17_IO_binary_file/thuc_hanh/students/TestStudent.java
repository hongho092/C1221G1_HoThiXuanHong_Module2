package ss17_IO_binary_file.thuc_hanh.students;

import java.util.ArrayList;
import java.util.List;

import static ss17_IO_binary_file.thuc_hanh.students.WriteReadStudent.readDataFromFile;
import static ss17_IO_binary_file.thuc_hanh.students.WriteReadStudent.writeToFile;

public class TestStudent {
    private static final String FILE_WRITE = "src/ss17_IO_binary_file/thuc_hanh/students/Student.txt";
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add (new Student(1,"nguyen a", "DHNN"));
        studentList.add (new Student(2,"nguyen b", "DHNN"));
        studentList.add(new Student(3,"nguyen c", "DHNN"));
        studentList.add(new Student(4,"nguyen d", "DHNN"));
        studentList.add(new Student(5,"nguyen e", "DHNN"));

        writeToFile(FILE_WRITE, studentList);

        List<Student> studentDataFromFile = readDataFromFile(FILE_WRITE);
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
