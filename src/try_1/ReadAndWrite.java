package try_1;


import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWrite {
    protected static void  writeStringListToCSV(Map<Produce, Integer> map, String pathFile, Boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Map.Entry<Produce, Integer> s: map.entrySet()) {
//                bufferedWriter.write(String.valueOf(s));
                bufferedWriter.write(String.valueOf(s));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static Map<Produce, Integer> readProductFromCSV(){
//        Map<Produce, Integer> produceIntegerMap = new LinkedHashMap<>();
//        File file = new File("src/try_1/Produce.csv");
//        FileReader fileReader=null;
//        BufferedReader bufferedReader=null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader= new BufferedReader(fileReader);
//            String line=null;
//            String[] arr=null;
//            while ((line=bufferedReader.readLine())!=null){
////                arr = line.split(",");
////                Student student = new Student(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
////                studentList.add(student);
//                System.out.println(line);
//
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return produceIntegerMap;
//    }

    public static void readProductFromCSV(){
        Map<Produce, Integer> produceIntegerMap = new LinkedHashMap<>();
        File file = new File("src/try_1/Produce.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line=null;
            String[] arr=null;
            while ((line=bufferedReader.readLine())!=null){
//                arr = line.split(",");
//                Student student = new Student(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
//                studentList.add(student);
                System.out.println(line);

            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return produceIntegerMap;
    }
}
