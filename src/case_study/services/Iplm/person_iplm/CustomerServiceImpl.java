package case_study.services.Iplm.person_iplm;

import case_study.models.person.Customer;
import case_study.services.interface_service.ICustomerService;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Validate validate = new Validate();
    Scanner sca = new Scanner(System.in);
    PersonService personService = new PersonService();
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
        Customer customer = new Customer();
        System.out.println("Nhập hoTen, ngaySinh, gioiTinh, soCMDN, email, soDienThoai, loaiKhach, diaChi, maKhachHang: ");
        personService.PersonCommon(customer);
        System.out.print("LoaiKhach: ");
        customer.setLoaiKhach(chonLoaiKhach());
        System.out.print("Diachi: ");
        customer.setDiaChi(sca.nextLine());
        System.out.println("MaKhachHang: ");
        customer.setMaKhachHang(Integer.parseInt(sca.nextLine()));
        List<Customer> customerList = new LinkedList<>();
        customerList.add(customer);
        ReadAndWrite.writeCustomerListToCSV(customerList, true);
        showList();
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWrite.readCustomerListFromCSV();
        showList();
        System.out.print("Nhập maKhachHang cần sửa -> ");
        int maKhachHang = Integer.parseInt(sca.nextLine());
        boolean out = true;
        do {
            System.out.print("1. HoTen\n" +
                    "2. NgaySinh\n" +
                    "3. GioiTinh\n" +
                    "4. SoCMDN \n" +
                    "5. Email \n" +
                    "6. SoDienThoai\n" +
                    "7. LoaiKhach\n" +
                    "8. DiaChi\n" +
                    "9. MaKhachHang\n");
            System.out.print("Chọn thông tin muốn sửa: ");
            int choice = Integer.parseInt(sca.nextLine());
            for (int i=0; i<customerList.size(); i++) {
                if (maKhachHang == customerList.get(i).getMaKhachHang()) {
                    switch (choice) {
                        case 1:
                            System.out.print("HoTen: ");
                            customerList.get(i).setHoTen(sca.nextLine());
                            break;
                        case 2:
                            System.out.print("NgaySinh: ");
                            customerList.get(i).setNgaySinh(validate.regexAge(sca.nextLine()));
                            break;
                        case 3:
                            System.out.print("GioiTinh: ");
                            customerList.get(i).setGioiTinh(sca.nextLine());
                            break;
                        case 4:
                            System.out.print("SoCMDN: ");
                            customerList.get(i).setSoCMDN(Integer.parseInt(sca.nextLine()));
                            break;
                        case 5:
                            System.out.print("Email: ");
                            customerList.get(i).setEmail(sca.nextLine());
                            break;
                        case 6:
                            System.out.print("SoDienThoai: ");
                            customerList.get(i).setSoDienThoai(sca.nextLine());
                            break;
                        case 7:
                            System.out.println("LoaiKhach: ");
                            customerList.get(i).setLoaiKhach(chonLoaiKhach());
                            break;
                        case 8:
                            System.out.print("DiaChi: ");
                            customerList.get(i).setDiaChi(sca.nextLine());
                            break;
                        case 9:
                            System.out.print("MaKhachHang: ");
                            customerList.get(i).setMaKhachHang(Integer.parseInt(sca.nextLine()));
                            break;
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
