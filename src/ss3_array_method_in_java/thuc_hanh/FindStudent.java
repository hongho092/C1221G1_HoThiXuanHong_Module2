package ss3_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter name of student: ");
        String student = scanner.nextLine();
        boolean find = false;
        for (int i=0; i<students.length; i++) {
            if (students[i].equals(student)) {
                System.out.println("This is "+student+" and: "+i);
                find = true;
                break;
            }
        }
        if (find == false) {
            System.out.println("not exist");
        }
    }
}
