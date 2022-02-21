package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public String oneToTen(int number) {
        String str = "";
        switch (number) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
        }
        return str;
    }

    public String ones(int number) {
        String str = "";
        switch (number) {
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
                int hangDonVi = number % 10;
                str = oneToTen(hangDonVi) + "teen";
                break;
        }
        return str;
    }

    public String tens(int number) {
        String str = "";
        switch (number) {
            case 20:
                str = "twenty";
                break;
            case 30:
                str = "thirty";
                break;
            case 40:
                str = "forty";
                break;
            case 50:
                str = "fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int hangChuc = number / 10;
                str = oneToTen(hangChuc) + "ty";
                break;
        }
        return str;
    }

    public String hundred(int number) {
        String str = "";
        switch (number) {
            case 100:
            case 200:
            case 300:
            case 400:
            case 500:
            case 600:
            case 700:
            case 800:
            case 900:
                int hangTram = number / 100;
                str = oneToTen(hangTram) + "hundred ";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        NumberToString num = new NumberToString();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number: ");

        int number = sc.nextInt();
        if (number > 0 && number <= 10){
            String result = num.oneToTen(number);
            System.out.println("Result: " + result);
        }else if (number > 10 && number < 20) {
            String result = num.ones(number);
            System.out.println("Result: " + result);
        } else if(number >= 20 && number < 100) {
            int hangChuc = (number / 10) * 10;
            int hangDonVi = number % 10;
            String result = num.tens(hangChuc) + " " + num.oneToTen(hangDonVi);
            System.out.println("Result: " + result);
        } else {
            int hangTram = (number / 100) * 100;
            int hangChuc = ((number % 100) / 10) * 10;
            int hangDonVi = ((number % 100) % 10);
            if(hangChuc <= 19){
                String result = num.hundred(hangTram)  + num.ones(hangChuc + hangDonVi);
                System.out.println("Result: " + result);
            }else {
                String result = num.hundred(hangTram) + num.tens(hangChuc) + num.oneToTen(hangDonVi);
                System.out.println("Result: " + result);
            }

        }
    }
}

