package ss10_array_linked_list.thuc_hanh.list_simple;

public class MyListTest {
    public static void main(String[] args) {
        // danh sách dữ liệu Integer
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(2);
        listInteger.add(7);
        listInteger.add(4);
        listInteger.add(6);
        listInteger.add(5);
        listInteger.add(3);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 3: " + listInteger.get(3));
//        System.out.println("element 6: " + listInteger.get(6));

        listInteger.get(5);

        // danh sách dư liệu String
        MyList<String> listString = new MyList<String>();
        listString.add("hing");
//        listString.add(4);
        System.out.println(listString.get(0));

        // danh sách dữ liệu đối tượng
        MyList<Object> listObject = new MyList<Object>();
        Student stu1 = new Student(64, "lap trinh 1", "NN");
        Student stu2 = new Student(29, "lap trinh 2", "NN");
        listObject.add(stu1);
        listObject.add(stu2);
        System.out.println(listObject.get(0));
        System.out.println(listObject.get(1));
        // Không thể in ra danh sách vì định dạng bên MyList
    }
}
