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
        System.out.println("Nhập maSo, hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi: ");
        int maSo = Integer.parseInt(sca.nextLine());
        String hoTen = sca.nextLine();
        String ngaySinh = validate.regexAge(sca.nextLine());
        String gioiTinh = sca.nextLine();
        long soCMDN = Integer.parseInt(sca.nextLine());
        String email = sca.nextLine();
        long soDienThoai = Integer.parseInt(sca.nextLine());
        String loaiKhach = sca.nextLine();
        String diaChi = sca.nextLine();
        Customer customer = new Customer(maSo, hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi);
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
                System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi moi: ");
                customerList.get(i).setHoTen(sca.nextLine());
                customerList.get(i).setNgaySinh(sca.nextLine());
                customerList.get(i).setGioiTinh(sca.nextLine());
                customerList.get(i).setSoCMDN(Integer.parseInt(sca.nextLine()));
                customerList.get(i).setEmail(sca.nextLine());
                customerList.get(i).setSoDienThoai(Integer.parseInt(sca.nextLine()));
                customerList.get(i).setLoaiKhach(sca.nextLine());
                customerList.get(i).setDiaChi(sca.nextLine());
            }
        }
        ReadAndWrite.writeCustomerListToCSV(customerList, false);
        showList();
    }
}