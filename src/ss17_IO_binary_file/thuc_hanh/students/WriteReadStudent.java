package ss17_IO_binary_file.thuc_hanh.students;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadStudent {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }


    /*
        File(lấy đường link) -> FileWrite -> BufferWrite (viết file text)
        File(lấy đường link) -> FileOutputStream -> ObjectOutputStream (viết đối tượng binary)
     */
}
