package ss16_IO_text_file.thuc_hanh;

import java.util.List;

public class FindMaxValue {
    public static int findMaxNumber(List<Integer> listNumber) {
        int max = listNumber.get(0);
        for (int i=1; i< listNumber.size(); i++) {
            if(max < listNumber.get(i)) {
                max = listNumber.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> listNumber = readAndWriteFile.readFile("src/ss16_IO_text_file/thuc_hanh/Numbers.csv");
        int max = findMaxNumber(listNumber);
        System.out.println(max);
        readAndWriteFile.writeFile("src/ss16_IO_text_file/thuc_hanh/NumberMax.csv", max);
        System.out.println();
    }
}
