package ss03_array_method_in_java.bai_tap;

public class FindMax {
    public static void main(String[] args) {
        int [][] findMax = {
                {4,6,7,2,3},
                {10,3,5,9,1}
        };
        int max = findMax[0][0];
        for (int i=0; i<findMax.length; i++) {
            for (int j=0; j<findMax[i].length; j++) {
                if (findMax[i][j] > max) {
                    max = findMax[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
