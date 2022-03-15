package case_study.utils;

import case_study.models.*;
import exercise.models.Brand;
import exercise.models.Car;
import exercise.models.Motorbike;
import exercise.models.Truck;

import java.io.*;
import java.util.*;

public class ReadAndWrite {
    static final String BOOKING_FILE = "src/case_study/data/booking.csv";
    static final String CONTRACT_FILE = "src/case_study/data/contract.csv";
    static final String CUSTOMER_FILE = "src/case_study/data/customer.csv";
    static final String EMPLOYEE_FILE = "src/case_study/data/employee.csv";
    static final String HOUSE_FILE = "src/case_study/data/house.csv";
    static final String ROOM_FILE = "src/case_study/data/room.csv";
    static final String VILLA_FILE = "src/case_study/data/villa.csv";

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

    public static void  writeBookingListToCSV(List<Booking> bookingList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Booking b : bookingList) {
            stringList.add(b.getInfoBookingToCSV());
        }
        writeStringListToCSV(stringList,BOOKING_FILE,append);
    }

    public static void  writeContractListToCSV(List<Contract> contractList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Contract c : contractList) {
            stringList.add(c.getInfoContractToCSV());
        }
        writeStringListToCSV(stringList,CONTRACT_FILE,append);
    }

    public static void  writeCustomerListToCSV(List<Customer> customerList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.getInfoCustomerToCSV());
        }
        writeStringListToCSV(stringList,CUSTOMER_FILE,append);
    }

    public static void  writeEmployeeListToCSV(List<Employee> employeeList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoEmployeeToCSV());
        }
        writeStringListToCSV(stringList,EMPLOYEE_FILE,append);
    }

    private static void  writeLinkedHashMapToCSV(Map<Facility, Integer> facilityIntegerMap, String pathFile, Boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                bufferedWriter.write(String.valueOf(entry));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  writeHouseListToCSV(LinkedHashMap<House, Integer> houseList, Boolean append){
        Map<Facility, Integer> houseIntegerMap = new LinkedHashMap<>();
        for (Map.Entry<House, Integer> entry : houseList.entrySet()) {
            houseIntegerMap.put((House) entry, 0);
        }
        writeLinkedHashMapToCSV(houseIntegerMap, HOUSE_FILE, append);
//        writeStringListToCSV(stringList,HOUSE_FILE,append);
    }

    public static void  writeRoomListToCSV(List<Room> roomList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Room r : roomList) {
            stringList.add(r.getInfoRoomToCSV());
        }
        writeStringListToCSV(stringList,ROOM_FILE,append);
    }

    public static void  writeVillaListToCSV(List<Villa> villaList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Villa v : villaList) {
            stringList.add(v.getInfoVillaToCSV());
        }
        writeStringListToCSV(stringList,VILLA_FILE,append);
    }

    public static List<Booking> readBookingListFromCSV(){
        List<Booking> bookingList = new ArrayList<>();
        File file = new File(BOOKING_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Booking booking = new Booking(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5]);
                bookingList.add(booking);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }

    public static List<Contract> readContractListFromCSV(){
        List<Contract> contractList = new ArrayList<>();
        File file = new File(CONTRACT_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Contract contract = new Contract(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),Integer.parseInt(arr[4]));
                contractList.add(contract);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contractList;
    }

    public static List<Customer> readCustomerListFromCSV(){
        List<Customer> customerList = new LinkedList<>();
        File file = new File(CUSTOMER_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Customer customer = new Customer(arr[0],Integer.parseInt(arr[1]),arr[2],Integer.parseInt(arr[3]),arr[4],Integer.parseInt(arr[5]),arr[6],arr[7]);
                customerList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public static List<Employee> readEmployeeListFromCSV(){
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(EMPLOYEE_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Employee employee = new Employee(arr[0],Integer.parseInt(arr[1]),arr[2],Integer.parseInt(arr[3]),arr[4],Integer.parseInt(arr[5]),arr[6],arr[7],Integer.parseInt(arr[8]),Integer.parseInt(arr[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static List<House> readHouseListFromCSV(){
        List<House> houseList = (List<House>) new LinkedHashMap<House, Integer>();
        File file = new File(HOUSE_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                House house = new House(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5]);
                houseList.add(house);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public static List<Room> readRoomListFromCSV(){
        List<Room> roomList = new ArrayList<>();
        File file = new File(ROOM_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Room room = new Room(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5]);
                roomList.add(room);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public static List<Villa> readVillaListFromCSV(){
        List<Villa> villaList = new ArrayList<>();
        File file = new File(VILLA_FILE);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Villa villa = new Villa(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5],Integer.parseInt(arr[6]),Integer.parseInt(arr[7]));
                villaList.add(villa);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
