package ss12_java_collection_framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Student student0 = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student0);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        //Comparable
        Collections.sort(lists);
        for(Student student : lists){
            System.out.println(student.toString());
        }

        //Comparator
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student student : lists){
            System.out.println(student.toString());
        }
    }
}
