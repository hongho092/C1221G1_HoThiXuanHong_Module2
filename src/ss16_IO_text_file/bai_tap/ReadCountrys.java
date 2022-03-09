package ss16_IO_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadCountrys {
    public void readCountry(String filepath) {
        try{
            File file = new File(filepath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn - > ");
        String filepath = scanner.nextLine();
        ReadCountrys readCountrys = new ReadCountrys();
        readCountrys.readCountry(filepath);
    }
}
