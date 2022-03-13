package exercise.util;

import exercise.models.Brand;
import exercise.models.Car;
import exercise.models.Motorbike;
import exercise.models.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    static final String CAR_FILE = "src/exercise/data/oto.csv";
    static final String MOTORBIKE_FILE = "src/exercise/data/xeMay.csv";
    static final String TRUCK_FILE = "src/exercise/data/xeTai.csv";
    static final String BRAND_FILE = "src/exercise/data/hangSanXuat.csv";

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

    public static void  writeCarListToCSV(List<Car> carList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Car c : carList) {
            stringList.add(c.getInfoCarToCSV());
        }
        writeStringListToCSV(stringList,CAR_FILE,append);
    }

    public static void  writeMotorbikeListToCSV(List<Motorbike> motorbikeList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Motorbike m : motorbikeList) {
            stringList.add(m.getInfoMotorbikrToCSV());
        }
        writeStringListToCSV(stringList,MOTORBIKE_FILE,append);
    }

    public static void  writeTruckListToCSV(List<Truck> truckList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Truck t : truckList) {
            stringList.add(t.getInfoTruckToCSV());
        }
        writeStringListToCSV(stringList,TRUCK_FILE,append);
    }

    public static List<Car> readCarListFromCSV(){
        List<Car> carList = new ArrayList<>();
        File file = new File(CAR_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Car car = new Car(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]),arr[5]);
                carList.add(car);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return carList;
    }

    public static List<Motorbike> readMotorbikeListFromCSV(){
        List<Motorbike> motorbikeList = new ArrayList<>();
        File file = new File(MOTORBIKE_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Motorbike motorbike = new Motorbike(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]));
                motorbikeList.add(motorbike);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return motorbikeList;
    }

    public static List<Truck> readTruckListFromCSV(){
        List<Truck> truckList = new ArrayList<>();
        File file = new File(TRUCK_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Truck truck = new Truck(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3],Integer.parseInt(arr[4]));
                truckList.add(truck);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return truckList;
    }

    public static List<Brand> readBrandListFromCSV(){
        List<Brand> brandList = new ArrayList<>();
        File file = new File(BRAND_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Brand brand = new Brand(arr[0],arr[1],arr[2]);
                brandList.add(brand);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return brandList;
    }
}
