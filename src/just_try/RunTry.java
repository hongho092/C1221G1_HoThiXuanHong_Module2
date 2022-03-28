package just_try;

import case_study.utils.Validate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RunTry {
//    String start;
//    String end;
//    final String REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

    public static void main(String[] args) {
        String start;
        String end;
        final String REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Nhập ngày bắt đầu: ");
        start = Validate.regexStr(scanner.nextLine(), REGEX, "Nhập sai định dạnh, nhập lại: ");
        LocalDate start1 = LocalDate.parse(start, formatter);
        int check = 1;
        System.out.print("Nhập ngày kết thúc: ");
        do {
            end = Validate.regexStr(scanner.nextLine(), REGEX, "Nhập sai định dạng, nhập lại: ");
            LocalDate end1 = LocalDate.parse(end, formatter);
            if (Period.between(start1, end1).getDays() < 0) {
                System.out.print("Nhập lại ngày kêt thúc: ");
                check = 2;
            } else check = 1;
        } while (check == 2);
        System.out.println("Hoàn thành nhập ngày tháng.");

    }
}
