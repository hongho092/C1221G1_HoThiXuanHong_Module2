package he_thong_quan_li_sinh_vien_cs.utils;

import he_thong_quan_li_sinh_vien_cs.models.GiaoVien;
import he_thong_quan_li_sinh_vien_cs.models.LopHoc;
import he_thong_quan_li_sinh_vien_cs.models.SinhVien;
import ss21_design_patterns.demo_singleton.Singleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {

    private final static String SINHVIEN_FILE = "src/he_thong_quan_li_sinh_vien_cs/data/SinhVien.csv";
    private final static String LOPHOC_FILE = "src/he_thong_quan_li_sinh_vien_cs/data/LopHoc.csv";
    private final static String GIAOVIEN_FILE = "src/he_thong_quan_li_sinh_vien_cs/data/GiaoVien.csv";

    public static void  writeStringListToCSV(List<String> stringList, String pathFile, Boolean append){
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

    public static void  writeSinhVienListToCSV(List<SinhVien> sinhVienList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (SinhVien sv : sinhVienList) {
            stringList.add(sv.getInfoSinhVienToCSV());
        }
        writeStringListToCSV(stringList,SINHVIEN_FILE,append);
    }

    public static List<SinhVien> readSinhVienListFromCSV(){
        List<SinhVien> sinhVienList = new ArrayList<>();
        File file = new File(SINHVIEN_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                SinhVien sinhVien = new SinhVien(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5]);
                sinhVienList.add(sinhVien);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sinhVienList;
    }

    public static List<LopHoc> readLopHocListFromCSV(){
        List<LopHoc> lopHocList = new ArrayList<>();
        File file = new File(LOPHOC_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                LopHoc lopHoc = new LopHoc(arr[0],arr[1],arr[2]);
                lopHocList.add(lopHoc);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lopHocList;
    }

    public static List<GiaoVien> readGiaoVienListFromCSV(){
        List<GiaoVien> giaoVienList = new ArrayList<>();
        File file = new File(GIAOVIEN_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                GiaoVien giaoVien = new GiaoVien(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4]);
                giaoVienList.add(giaoVien);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return giaoVienList;
    }
}
