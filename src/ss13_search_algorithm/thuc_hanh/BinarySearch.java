package ss13_search_algorithm.thuc_hanh;

public class BinarySearch {
    static int[] list = {2,5,13,26,35,42,56,68,75,88,93};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    public static void main(String[] args) {
        System.out.print("Vị trí của key -> ");
        System.out.println(binarySearch(list, 26));
        System.out.print("Vị trí của key -> ");
        System.out.println(binarySearch(list, 28));
        System.out.print("Vị trí của key -> ");
        System.out.println(binarySearch(list, 93));
    }
}










