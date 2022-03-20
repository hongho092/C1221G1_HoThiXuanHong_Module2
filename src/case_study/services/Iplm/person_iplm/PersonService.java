package case_study.services.Iplm.person_iplm;

import case_study.models.person.Person;
import case_study.utils.Validate;

import java.util.Scanner;

public class PersonService{
    Scanner sca = new Scanner(System.in);
    Validate validate = new Validate();
    public void PersonCommon (Person person) {
        System.out.print("HoTen: ");
        person.setHoTen(sca.nextLine());
        System.out.print("NgaySinh: ");
        person.setNgaySinh(validate.regexAge(sca.nextLine()));
        System.out.print("GioiTinh: ");
        person.setGioiTinh(sca.nextLine());
        System.out.print("SoCMND: ");
        person.setSoCMDN(Integer.parseInt(sca.nextLine()));
        System.out.print("Email (.....@gmail.com): ");
        person.setEmail(sca.nextLine());
        while (!validate.ValidateEmail(person.getEmail())) {
            System.out.print("Nhập email sai format, hãy nhập lại: ");
            person.setEmail(sca.nextLine());
        }
        System.out.print("SoDienThoai: ");
        person.setSoDienThoai(sca.nextLine());
        while (!validate.ValidatePhoneNumber(person.getSoDienThoai())) {
            System.out.print("Nhập soDienThoai sai format, hãy nhập lại: ");
            person.setSoDienThoai(sca.nextLine());
        }
    }
}
