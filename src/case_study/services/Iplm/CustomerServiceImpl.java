package case_study.services.Iplm;

import case_study.models.person.Customer;
import case_study.services.ICustomerService;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Validate validate = new Validate();
    Scanner sca = new Scanner(System.in);
    @Override
    public void showList() {
        List<Customer> customerList = ReadAndWrite.readCustomerListFromCSV();
        System.out.println("Danh sách khách hàng: ");
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi, maKhachHang: ");
        String hoTen = sca.nextLine();
        String ngaySinh = validate.regexAge(sca.nextLine());
        String gioiTinh = sca.nextLine();
        long soCMDN = Integer.parseInt(sca.nextLine());
        String email = sca.nextLine();
        long soDienThoai = Integer.parseInt(sca.nextLine());
        String loaiKhach = chonLoaiKhach();
        String diaChi = sca.nextLine();
        int maKhachHang = Integer.parseInt(sca.nextLine());
        Customer customer = new Customer(hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi, maKhachHang);
        List<Customer> customerList = new LinkedList<>();
        customerList.add(customer);
        ReadAndWrite.writeCustomerListToCSV(customerList, true);
        showList();
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWrite.readCustomerListFromCSV();
        showList();
        System.out.print("Nhập tên khách hàng cần sửa -> ");
        String hoTen = sca.nextLine();
        for (int i=0; i<customerList.size(); i++) {
            if (hoTen.equals(customerList.get(i).getHoTen())) {
                System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi, maKhachHang moi: ");
                customerList.get(i).setHoTen(sca.nextLine());
                customerList.get(i).setNgaySinh(sca.nextLine());
                customerList.get(i).setGioiTinh(sca.nextLine());
                customerList.get(i).setSoCMDN(Integer.parseInt(sca.nextLine()));
                customerList.get(i).setEmail(sca.nextLine());
                customerList.get(i).setSoDienThoai(Integer.parseInt(sca.nextLine()));
                customerList.get(i).setLoaiKhach(chonLoaiKhach());
                customerList.get(i).setDiaChi(sca.nextLine());
                customerList.get(i).setMaKhachHang(Integer.parseInt(sca.nextLine()));
            }
        }
        ReadAndWrite.writeCustomerListToCSV(customerList, false);
        showList();
    }

    public String chonLoaiKhach () {
        String[] loaiKhach = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
        for (int i=0; i< loaiKhach.length; i++) {
            System.out.println(i+1+" "+loaiKhach[i]);
        }
        System.out.print("Chọn loại khách: ");
        int choice = Integer.parseInt(sca.nextLine());
        return loaiKhach[choice - 1];
    }
}
