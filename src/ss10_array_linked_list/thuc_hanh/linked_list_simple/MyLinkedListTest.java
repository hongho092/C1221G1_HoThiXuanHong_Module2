package ss10_array_linked_list.thuc_hanh.linked_list_simple;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        System.out.println("In danh sach lan dau");
        linkedList.printList();
        System.out.println("---------------------------------------\n"+
                "In danh sach lan 2");
        linkedList.add(3,15);
        linkedList.addFirst(14);
        linkedList.printList();
        System.out.println("-----------------------------------");
        System.out.println(linkedList.get(3));
    }
}
