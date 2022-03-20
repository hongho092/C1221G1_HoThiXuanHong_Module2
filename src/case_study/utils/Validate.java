package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {

    static final String VILLA_REGEX = "^SVVL-\\d{4}$";
    static final String HOUSE_REGEX = "^SVHO-\\d{4}$";
    static final String ROOM_REGEX = "^SVRO-\\d{4}$";
    static final String TEN_REGEX = "^([A-Z]{1}[a-z]+$|^[A-Z]{1}[a-z]+ [a-z]+$|^[A-Z]{1}[a-z]+ [a-z]+ [a-z]+$|^[A-Z]{1}[a-z]+ [a-z]+ [a-z]+ [a-z]+$)";
    static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    static final String PHONENUMBER_REGEX = "^O{1}\\d{9}$";
    static final String EMAIL_REGEX = "\\w*@gmail.com";
//    static final String DIENTICH_REGEX = "^[3-9]{1}[0-9]+|[1-2]{1}[0-9]{2,}$";
//    static final String SOTANG_REGEX = "^[1-9]+$";

    public static boolean ValidateMaVilla (String nameVilla) {
        return nameVilla.matches(VILLA_REGEX);
    }

    public static boolean ValidateMaHouse (String nameHouse) {
        return nameHouse.matches(HOUSE_REGEX);
    }

    public static boolean ValidateMaRoom (String nameRoom) {
        return nameRoom.matches(ROOM_REGEX);
    }

    public static boolean ValidateTen (String tenDichVu) {
        return tenDichVu.matches(TEN_REGEX);
    }

    public static boolean ValidatePhoneNumber (String soDienThoai) {
        return soDienThoai.matches(PHONENUMBER_REGEX);
    }

    public static boolean ValidateEmail (String email) {
        return email.matches(EMAIL_REGEX);
    }

//    public static String regexStr (String temp, String regex, String error) {
//        Scanner sca = new Scanner(System.in);
//        boolean check = false;
//        do {
//            if (temp.matches(regex)) {
//                check = true;
//            } else {
//                System.out.println(error);
//                temp = sca.nextLine();
//            }
//        } while (!check);
//        return temp;
//    }

    public static String regexAge(String temp) {
        Scanner sca = new Scanner(System.in);
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(BIRTHDAY_REGEX, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và nhỏ hơn 100, hãy nhập lại: ");
                    }
                } else {
                    throw new AgeException("Định dạng nhập vào sai, hãy nhập lại: ");
                }
            } catch (AgeException e) {
                System.out.print(e.getMessage());
                temp = sca.nextLine();
            }
        }
        return temp;
    }
}

//^\\p{Lu}\\p{Ll}+( \\p{Lu}\\p{Ll}+)*$











