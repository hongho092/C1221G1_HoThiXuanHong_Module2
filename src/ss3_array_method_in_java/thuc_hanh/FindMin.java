package ss3_array_method_in_java.thuc_hanh;

public class FindMin {
    public static void main(String[] args) {
        int [] arr1 = {34,67,23,89,34,66};
//        minValue(arr1);
        System.out.println(minValue(arr1));

    }
    public static int minValue(int [] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
//        System.out.println(min);
        return min;
    }
}
