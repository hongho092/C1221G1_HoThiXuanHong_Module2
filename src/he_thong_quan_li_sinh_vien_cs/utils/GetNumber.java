package he_thong_quan_li_sinh_vien_cs.utils;

import java.util.Scanner;

public class GetNumber {
    Scanner scanner = new Scanner(System.in);
    public int getNumberFormat(int a, int b) {
        boolean out = false;
        int choice = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < a || choice > b) {
                    throw new he_thong_quan_li_sinh_vien_cs.utils.NotNumberFindException();
                } else out = false;
            } catch (NotNumberFindException e) {
                System.out.print("Số phải thuộc phạm vi từ "+a+" đến "+b+", nhập lại: ");
                out = true;
            } catch (NumberFormatException e) {
                System.out.print("Sai format số, nhập lại: ");
                out = true;
            }
        } while (out);
        return choice;
    }

}
