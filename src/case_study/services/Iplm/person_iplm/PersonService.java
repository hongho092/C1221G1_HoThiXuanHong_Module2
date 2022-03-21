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
        person.setEmail(validate.regexEmail(sca.nextLine()));
        System.out.print("SoDienThoai: ");
        person.setSoDienThoai(validate.regexPhoneNumber(sca.nextLine()));
    }
}
