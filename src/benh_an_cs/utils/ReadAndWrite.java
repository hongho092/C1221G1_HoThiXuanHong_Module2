package benh_an_cs.utils;

import benh_an_cs.models.BenhAnThuong;
import benh_an_cs.models.BenhAnVip;
import case_study.models.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWrite {
    static final String BENHANTHUONG_FILE = "src/benh_an_cs/data/BenhAnThuong.csv";
    static final String BENHANVIP_FILE = "src/benh_an_cs/data/BenhAnVip.csv";

    private static void  writeStringListToCSV(List<String> stringList, String pathFile, Boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
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

    public static void  writeBenhAnThuongListToCSV(List<BenhAnThuong> benhAnThuongs, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (BenhAnThuong bat : benhAnThuongs) {
            stringList.add(bat.getInfoThuongToCSV());
        }
        writeStringListToCSV(stringList,BENHANTHUONG_FILE,append);
    }

    public static void  writeBenhAnVipListToCSV(List<BenhAnVip> benhAnVips, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (BenhAnVip bav : benhAnVips) {
            stringList.add(bav.getInfoVipToCSV());
        }
        writeStringListToCSV(stringList,BENHANVIP_FILE,append);
    }

    public static List<BenhAnThuong> readBenhAnThuongListFromCSV(){
        List<BenhAnThuong> benhAnThuongs = new LinkedList<>();
        File file = new File(BENHANTHUONG_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                BenhAnThuong benhAnThuong = new BenhAnThuong(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]);
                benhAnThuongs.add(benhAnThuong);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return benhAnThuongs;
    }

    public static List<BenhAnVip> readBenhAnVipListFromCSV(){
        List<BenhAnVip> benhAnVips = new LinkedList<>();
        File file = new File(BENHANVIP_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                BenhAnVip benhAnVip = new BenhAnVip(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
                benhAnVips.add(benhAnVip);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return benhAnVips;
    }
}
