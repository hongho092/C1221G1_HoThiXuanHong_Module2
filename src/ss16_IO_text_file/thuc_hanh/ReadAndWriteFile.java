package ss16_IO_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filepath) {
        List<Integer> listNumber = new ArrayList<>();
        try{
            File file = new File(filepath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listNumber.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return listNumber;
    }

    public void writeFile(String filepath, int max) {
        File file = new File(filepath);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write("Số lớn nhất là: "+max);
            bufferedWriter.newLine();
//            bufferedWriter.write(" ");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
