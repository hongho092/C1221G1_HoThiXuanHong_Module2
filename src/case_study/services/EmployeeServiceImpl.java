package case_study.services;

import case_study.models.Employee;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService{
    Scanner sca = new Scanner(System.in);
    @Override
    public void showList() {
        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
        System.out.println("Danh sách nhân viên: ");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, trinhDo, viTri, luong, maNhanVien: ");
        String hoTen = sca.nextLine();
        int ngaySinh = Integer.parseInt(sca.nextLine());
        String gioiTinh = sca.nextLine();
        long soCMDN = Integer.parseInt(sca.nextLine());
        String email = sca.nextLine();
        long soDienThoai = Integer.parseInt(sca.nextLine());
        String trinhDo = sca.nextLine();
        String viTri = sca.nextLine();
        int luong = Integer.parseInt(sca.nextLine());
        int maNhanVien = Integer.parseInt(sca.nextLine());
        Employee employee = new Employee(hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, trinhDo, viTri, luong, maNhanVien);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWrite.writeEmployeeListToCSV(employeeList, true);
        showList();
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
        showList();
        System.out.print("Nhập tên nhân viên cần sửa -> ");
        String hoTen = sca.nextLine();
        for (int i=0; i<employeeList.size(); i++) {
            if (hoTen.equals(employeeList.get(i).getHoTen())) {
                System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, trinhDo, viTri, luong, maNhanVien moi: ");
                employeeList.get(i).setHoTen(sca.nextLine());
                employeeList.get(i).setNgaySinh(Integer.parseInt(sca.nextLine()));
                employeeList.get(i).setGioiTinh(sca.nextLine());
                employeeList.get(i).setSoCMDN(Integer.parseInt(sca.nextLine()));
                employeeList.get(i).setEmail(sca.nextLine());
                employeeList.get(i).setSoDienThoai(Integer.parseInt(sca.nextLine()));
                employeeList.get(i).setTrinhDo(sca.nextLine());
                employeeList.get(i).setViTri(sca.nextLine());
                employeeList.get(i).setLuong(Integer.parseInt(sca.nextLine()));
                employeeList.get(i).setMaNhanVien(Integer.parseInt(sca.nextLine()));
            }
        }
        ReadAndWrite.writeEmployeeListToCSV(employeeList, false);
        showList();
    }
}
