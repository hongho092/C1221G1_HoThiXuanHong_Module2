package ss16_IO_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    private static final String FILE_READ = "src/ss16_IO_text_file/bai_tap/NameCountry.csv";
    private static final String FILE_WRITE = "src/ss16_IO_text_file/bai_tap/CopyNameCountry.csv";
    public static void copy () {
        try {
            File fileRead = new File(FILE_READ);
            File fileWrite = new File(FILE_WRITE);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWrite, true));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copy();
    }
}
