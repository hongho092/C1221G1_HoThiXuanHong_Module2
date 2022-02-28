package ss10_array_linked_list.thuc_hanh.linked_list_simple;

import javax.xml.soap.Node;
    // tao lop MyLinkedList chua lop Node
public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // them data vao vi tri thu index trong danh sach
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i<index-1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    // them data vao vi tri du trong danh sach
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //lay phan tu o vi tri thu index
    public Node get(int index) {
        Node temp = head;
        for (int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //cai dat phuong thuc printList
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    }
