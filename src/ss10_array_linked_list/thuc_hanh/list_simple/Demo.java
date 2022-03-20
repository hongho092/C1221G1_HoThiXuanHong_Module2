package ss10_array_linked_list.thuc_hanh.list_simple;

import ss10_array_linked_list.thuc_hanh.list_simple.Student;

import java.util.*;

public class Demo {
//    public static class Student {
//        private i
//    }
    public static void main(String[] args) {
//        Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "Cơ sở lập trình");
//        hashMap.put(2, "C++");
//        hashMap.put(3, "C Sharp");
//        hashMap.put(4, "PHP");
//        hashMap.put(5, "Java");
//
////        System.out.println(hashMap.get(2));
////        System.out.println(hashMap);
//
        // hiển thị theo key
//        for (Integer key : hashMap.keySet()) {
//            System.out.println("Key: "+ key);
//        }
//
//        System.out.println("--------------------------");
//
        // hiển thị theo value
//        for (String value : hashMap.values()) {
//            System.out.println("Value: "+ value);
//        }

//        Map<Integer, Student> studentMap = new LinkedHashMap<>();
//        studentMap.put(1, new Student(1, "Hoa1", "NN"));
//        studentMap.put(2, new Student(2, "Hoa2", "NN"));
//        studentMap.put(4, new Student(4, "Hoa4", "NN"));
//        studentMap.put(3, new Student(3, "Hoa3", "NN"));
//        studentMap.put(4, new Student(4, "Hoa4", "NN"));

//        System.out.println(studentMap.get(3));

//        System.out.println(studentMap);

        // hiển thị theo entry
//        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
//            System.out.println(entry);
//        }

//        for (Integer key : studentMap.keySet()) {
//            System.out.println("Key of student: "+key);
//        }
//
//        for (Student student : studentMap.values()) {
//            System.out.println("Value of student: "+ student);
//        }

        // tạo hashcode và equals
        Set<Student> students = new TreeSet<>();
        students.add(new Student(1, "Hoa1", "NN"));
        students.add(new Student(2, "Hoa4", "NN"));
        students.add(new Student(4, "Hoa4", "NN"));
        students.add(new Student(3, "Hoa4", "NN"));
        students.add(new Student(4, "Hoa4", "NN"));

//        System.out.println(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
