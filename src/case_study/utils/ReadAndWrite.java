package case_study.utils;

import case_study.models.*;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.models.person.Customer;
import case_study.models.person.Employee;

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

//    private static void  writeLinkedHashMapToCSV(Map<Facility, Integer> facilityIntegerMap, String pathFile, Boolean append){
//        File file = new File(pathFile);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
//            bufferedWriter= new BufferedWriter(fileWriter);
//            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
//                bufferedWriter.write(String.valueOf(entry));
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void  writeHouseListToCSV(Map<House, Integer> map, Boolean append){
        File file = new File(HOUSE_FILE);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Map.Entry<House, Integer> h: map.entrySet()) {
//                bufferedWriter.write(String.valueOf(s));
                bufferedWriter.write(String.valueOf(h));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void  writeHouseListToCSV(LinkedHashMap<House, Integer> houseList, Boolean append){
//        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
//        for (Map.Entry<House, Integer> entry : houseList.entrySet()) {
//            facilityIntegerMap.put((House) entry, 0);
//        }
//        writeLinkedHashMapToCSV(facilityIntegerMap, HOUSE_FILE, append);
////        writeStringListToCSV(stringList,HOUSE_FILE,append);
//    }

    public static void  writeRoomListToCSV(Map<Room, Integer> map, Boolean append){
        File file = new File(ROOM_FILE);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> v: map.entrySet()) {
                bufferedWriter.write(String.valueOf(v));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  writeVillaListToCSV(Map<Villa, Integer> map, Boolean append){
        File file = new File(VILLA_FILE);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            for (Map.Entry<Villa, Integer> v: map.entrySet()) {
                bufferedWriter.write(String.valueOf(v));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                Customer customer = new Customer(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),arr[5],Integer.parseInt(arr[6]),arr[7],arr[8]);
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
                Employee employee = new Employee(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),arr[5],Integer.parseInt(arr[6]),arr[7],arr[8],Integer.parseInt(arr[9]),Integer.parseInt(arr[10]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static void readHouseListFromCSV(){
        File file = new File(HOUSE_FILE);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readRoomListFromCSV(){
        File file = new File(ROOM_FILE);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readVillaListFromCSV(){
        File file = new File(VILLA_FILE);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
