package ss14_sort_algorithm.thuc_hanh;

public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double [] list = {6.4,6.3,6.8,6.7,6.9,6.1,6.6,6.2,6.5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " - ");
    }
}
