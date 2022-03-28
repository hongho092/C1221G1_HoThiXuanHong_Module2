package phone_cs.utils;

import case_study.models.check_in.Booking;
import case_study.models.check_in.Contract;
import phone_cs.models.DienThoaiChinhHang;
import phone_cs.models.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReadAndWrite {
    static final String DTCH_FILE = "src/phone_cs/data/DienThoaiChinhHang.csv";
    static final String DTXT_FILE = "src/phone_cs/data/DienThoaiXachTay.csv";

    private static void  writeStringListToCSV(List<String> stringList, String pathFile, Boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String s: stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  writeDTCHListToCSV(List<DienThoaiChinhHang> dtchList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (DienThoaiChinhHang dtch : dtchList) {
            stringList.add(dtch.getInfoCHToCSV());
        }
        writeStringListToCSV(stringList,DTCH_FILE,append);
    }

    public static void  writeDTXTListToCSV(List<DienThoaiXachTay> dtxtList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (DienThoaiXachTay dtxt : dtxtList) {
            stringList.add(dtxt.getInfoXTToCSV());
        }
        writeStringListToCSV(stringList,DTXT_FILE,append);
    }

    public static List<DienThoaiChinhHang> readDTCHListFromCSV(){
        List<DienThoaiChinhHang> dtchList = new ArrayList<>();
        File file = new File(DTCH_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                DienThoaiChinhHang dtch = new DienThoaiChinhHang(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
                dtchList.add(dtch);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtchList;
    }

    public static List<DienThoaiXachTay> readDTXTListFromCSV(){
        List<DienThoaiXachTay> dtxtList = new ArrayList<>();
        File file = new File(DTXT_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                DienThoaiXachTay dtxt = new DienThoaiXachTay(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
                dtxtList.add(dtxt);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dtxtList;
    }
}
