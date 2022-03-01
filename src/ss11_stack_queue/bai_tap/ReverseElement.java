package ss11_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseElement {
    public static void reverseInteger() {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(4);
        integerStack.push(9);
        integerStack.push(6);
        integerStack.push(10);
        integerStack.push(3);
        System.out.println("Mang integer chua dao nguoc: "+integerStack);
        List<Integer> newArray = new ArrayList<Integer>();
        while (!integerStack.isEmpty()) {
            newArray.add(integerStack.pop());
        }
        System.out.println("Mang integer da dao nguoc: "+newArray);
    }

    public static void reverseString() {
        Stack<Character> stringStack = new Stack<>();
        String mWord = "You and me are friends";
        for (int i=0; i<mWord.length(); i++) {
            stringStack.push(mWord.charAt(i));
        }
        System.out.println("String chua dao nguoc: "+stringStack);
        String newString = "";
        while (!stringStack.isEmpty()) {
            newString += stringStack.pop();
        }
        System.out.println("String da dao nguoc: "+newString);
    }

    public static void main(String[] args) {
        reverseInteger();
        System.out.println("-----------------------------------------------------------");
        reverseString();
    }
}
