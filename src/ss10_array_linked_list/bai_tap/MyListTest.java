package ss10_array_linked_list.bai_tap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>(5);
        myList.add(0, "You");
        myList.add(1, "And");
        myList.add(2, "Me");
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList.indexOf("And"));
        System.out.println(myList);
    }
}
