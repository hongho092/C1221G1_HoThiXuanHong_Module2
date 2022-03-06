package ss13_search_algorithm.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = scanner.nextLine();

        ArrayList<Character> maxList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            ArrayList<Character> newList = new ArrayList<>();
            newList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(j) > newList.get(newList.size()-1)){
                    newList.add(str.charAt(j));
                }
            }
            if (newList.size() > maxList.size()){
                maxList.clear();
                maxList.addAll(newList);
            }
            newList.clear();
        }
        for (Character character : maxList){
            System.out.print(character);
        }
    }
}
