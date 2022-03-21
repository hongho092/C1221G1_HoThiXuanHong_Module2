package case_study.services.Iplm.person_iplm;

import case_study.models.person.Employee;
import case_study.services.interface_service.IEmployeeService;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Validate validate = new Validate();
    Scanner sca = new Scanner(System.in);
    PersonService personService = new PersonService();
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
        Employee employee = new Employee();
        System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, trinhDo, viTri, luong, maNhanVien: ");
        personService.PersonCommon(employee);
        System.out.print("TrinhDo: ");
        employee.setTrinhDo(chonTrinhDo());
        System.out.print("ViTri: ");
        employee.setViTri(chonViTri());
        System.out.print("Luong: ");
        employee.setLuong(Integer.parseInt(sca.nextLine()));
        System.out.print("MaNhanVien: ");
        employee.setMaNhanVien(Integer.parseInt(sca.nextLine()));
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        ReadAndWrite.writeEmployeeListToCSV(employeeList, true);
        showList();
    }

    @Override
    public void edit() {
        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
        showList();

        boolean out1 = true;
        int maNhanVien = -1;
        do{
            try{
                System.out.print("Nhập maNhanVien cần sửa -> ");
                maNhanVien = Integer.parseInt(sca.nextLine());
                for (int i=0; i<employeeList.size(); i++) {
                    if (maNhanVien == employeeList.get(i).getMaNhanVien()) {
                        out1 = true;
                        break;
                    } else {
                        System.out.print("Không có maNhanVien này.");
                        out1 = false;
                    }
                }
            }catch (NumberFormatException e) {
                System.out.print("Đã nhập sai fomat số, nhập lại: ");
                out1 = false;
            }
        } while (!out1);

        boolean out = true;
        do {
            System.out.print("1. HoTen\n" +
                    "2. NgaySinh\n" +
                    "3. GioiTinh\n" +
                    "4. SoCMDN \n" +
                    "5. Email \n" +
                    "6. SoDienThoai\n" +
                    "7. TrinhDo\n" +
                    "8. ViTri\n" +
                    "9. Luong\n" +
                    "10. MaNhanVien\n");
            System.out.print("Chọn thông tin muốn sửa: ");
            int choice = Integer.parseInt(sca.nextLine());
            for (int i=0; i<employeeList.size(); i++) {
                if (maNhanVien == employeeList.get(i).getMaNhanVien()) {
                    switch (choice) {
                        case 1:
                            System.out.print("HoTen: ");
                            employeeList.get(i).setHoTen(sca.nextLine());
                            break;
                        case 2:
                            System.out.print("NgaySinh: ");
                            employeeList.get(i).setNgaySinh(validate.regexAge(sca.nextLine()));
                            break;
                        case 3:
                            System.out.print("GioiTinh: ");
                            employeeList.get(i).setGioiTinh(sca.nextLine());
                            break;
                        case 4:
                            System.out.print("SoCMDN: ");
                            employeeList.get(i).setSoCMDN(Integer.parseInt(sca.nextLine()));
                            break;
                        case 5:
                            System.out.print("Email: ");
                            employeeList.get(i).setEmail(sca.nextLine());
                            break;
                        case 6:
                            System.out.print("SoDienThoai: ");
                            employeeList.get(i).setSoDienThoai(sca.nextLine());
                            break;
                        case 7:
                            System.out.println("TrinhDo: ");
                            employeeList.get(i).setTrinhDo(chonTrinhDo());
                            break;
                        case 8:
                            System.out.print("ViTri: ");
                            employeeList.get(i).setViTri(chonViTri());
                            break;
                        case 9:
                            System.out.print("Luong: ");
                            employeeList.get(i).setLuong(Integer.parseInt(sca.nextLine()));
                            break;
                        case 10:
                            System.out.print("MaNhanVien: ");
                            employeeList.get(i).setMaNhanVien(Integer.parseInt(sca.nextLine()));
                        default:
                            System.out.println("Không có lựa chọn nào: ");
                    }
                    System.out.print("Bạn có muốn thoát (Y?N?): ");
                    String ans = sca.nextLine();
                    if ("Y".equals(ans)) {
                        out = false;
                    }
                }
            }
        } while (out);
        ReadAndWrite.writeEmployeeListToCSV(employeeList, false);
        showList();
    }

    private String chonTrinhDo() {
        String[] trinhDo = {"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"};
        for (int i=0; i< trinhDo.length; i++) {
            System.out.println(i+1 + " " +trinhDo[i]);
        }
        System.out.print("Chọn trình độ: ");
        int choice = Integer.parseInt(sca.nextLine());
        return trinhDo[choice - 1];
    }

    private String chonViTri() {
        String[] viTri = {"Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lí", "Giám đốc"};
        for (int i=0; i< viTri.length; i++) {
            System.out.println(i+1 +" "+viTri[i]);
        }
        System.out.println("Chọn vị trí");
        int choice = Integer.parseInt(sca.nextLine());
        return viTri[choice - 1];
    }
}
