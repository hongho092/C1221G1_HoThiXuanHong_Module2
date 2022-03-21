package case_study.utils;

import case_study.models.check_in.Booking;
import case_study.models.check_in.Contract;
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

    // phương thức dùng để ghi chung đối tượng
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

    // phương thức dùng để ghi Booking
    public static void  writeBookingListToCSV(Set<Booking> bookingList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Booking b : bookingList) {
            stringList.add(b.getInfoBookingToCSV());
        }
        writeStringListToCSV(stringList,BOOKING_FILE,append);
    }

    // phương thức dùng để ghi Contract
    public static void  writeContractListToCSV(List<Contract> contractList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Contract c : contractList) {
            stringList.add(c.getInfoContractToCSV());
        }
        writeStringListToCSV(stringList,CONTRACT_FILE,append);
    }

    // phương thức dùng để ghi Customer
    public static void  writeCustomerListToCSV(List<Customer> customerList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.getInfoCustomerToCSV());
        }
        writeStringListToCSV(stringList,CUSTOMER_FILE,append);
    }

    // phương thức dùng để ghi Employee
    public static void  writeEmployeeListToCSV(List<Employee> employeeList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoEmployeeToCSV());
        }
        writeStringListToCSV(stringList,EMPLOYEE_FILE,append);
    }

    // phương thức dùng để ghi House
    public static void  writeHouseListToCSV(LinkedHashMap<House, Integer> houseList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (House h : houseList.keySet()) {
            stringList.add(h.getInfoHouseToCSV()+","+houseList.get(h));
        }
        writeStringListToCSV(stringList, HOUSE_FILE, append);
    }

    // phương thức dùng để ghi Room
    public static void  writeRoomListToCSV(LinkedHashMap<Room, Integer> roomList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Room r : roomList.keySet()) {
            stringList.add(r.getInfoRoomToCSV()+","+roomList.get(r));
        }
        writeStringListToCSV(stringList, ROOM_FILE, append);
    }

    // phương thức dùng để ghi Villa
    public static void  writeVillaListToCSV(LinkedHashMap<Villa, Integer> villaList, Boolean append){
        List<String> stringList = new ArrayList<>();
        for (Villa r : villaList.keySet()) {
            stringList.add(r.getInfoVillaToCSV()+","+villaList.get(r));
        }
        writeStringListToCSV(stringList, VILLA_FILE, append);
    }

    // // phương thức dùng để đọc mapHouse
    public static Map<House, Integer> readHouseListFromCSV(){
        Map<House, Integer> houseList = new LinkedHashMap<>();
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
                House house = new House(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7]));
                houseList.put(house, Integer.parseInt(arr[8]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    // phương thức dùng để đọc mapRoom
    public static Map<Room, Integer> readRoomListFromCSV(){
        Map<Room, Integer> roomList = new LinkedHashMap<>();
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
                Room room = new Room(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6]);
                roomList.put(room, Integer.parseInt(arr[7]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    // phương thức dùng để đọc mapVilla
    public static Map<Villa, Integer> readVillaListFromCSV(){
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
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
                Villa villa = new Villa(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7]),Integer.parseInt(arr[8]));
                villaList.put(villa, Integer.parseInt(arr[9]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    // phương thức dùng để đọc Booking
    public static Set<Booking> readBookingListFromCSV(){
        Set<Booking> bookingList = new TreeSet<>(new BookingComparator());
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
                Booking booking = new Booking(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),arr[4],arr[5]);
                bookingList.add(booking);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }

    // phương thức dùng để đọc Contract
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

    // phương thức dùng để đọc Customer
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
                Customer customer = new Customer(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),arr[4],arr[5],arr[6],arr[7],Integer.parseInt(arr[8]));
                customerList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    // phương thức dùng để đọc Employee
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
                Employee employee = new Employee(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),arr[4],arr[5],arr[6],arr[7],Integer.parseInt(arr[8]),Integer.parseInt(arr[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

}
