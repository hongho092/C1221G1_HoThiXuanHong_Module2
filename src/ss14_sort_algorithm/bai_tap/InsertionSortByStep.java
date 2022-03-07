package ss14_sort_algorithm.bai_tap;

public class InsertionSortByStep {
    public static void insertionSort(int[] array){
        System.out.println("Mảng ban đầu: ");
        for (int t : array) {
            System.out.print(t+" - ");
        }
        System.out.println(" ");
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
            System.out.println("Sau lần xếp thứ "+ i +": ");
            for (int t : array) {
                System.out.print(t+" - ");
            }
            System.out.println(" ");
        }
        System.out.println("Mảng hoàn thành");
        for (int t : array) {
            System.out.print(t+" - ");
        }
    }

    public static void main(String[] args) {
        int [] array = {9,8,6};
        insertionSort(array);
    }
}
