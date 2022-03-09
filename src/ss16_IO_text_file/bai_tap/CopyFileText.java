package ss16_IO_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void copy (String filepath1, String filepath2) {
        try {
            File fileRead = new File(filepath1);
            File fileWrite = new File(filepath2);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWrite, true));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập link đọc -> ");
        String filepath1 = scanner.nextLine();
        System.out.print("Nhập link viết -> ");
        String filepath2 = scanner.nextLine();
        copy(filepath1, filepath2);
    }
}
