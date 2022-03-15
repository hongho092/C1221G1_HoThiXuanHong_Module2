package case_study.controllers;

import case_study.services.CustomerServiceImpl;
import case_study.services.EmployeeServiceImpl;
import case_study.services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static void displayMainMenu() {
        Scanner sca = new Scanner(System.in);
        boolean out = true;
        while (out) {
            System.out.print("Menu: \n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Hãy chọn chức năng -> ");
            int choice = Integer.parseInt(sca.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Menu: \n" +
                            "1. Display list employees\n" +
                            "2. Add new employee\n" +
                            "3. Edit employee\n" +
                            "4. Return main menu\n");
                    int choice1 = Integer.parseInt(sca.nextLine());
                    switch (choice1) {
                        case 1:
                            employeeService.showList();
                            break;
                        case 2:
                            employeeService.add();
                            break;
                        case 3:
                            employeeService.edit();
                            break;
                        default:
                            System.out.println("Return main menu");
                    }
                    out = true;
                    break;
                case 2:
                    System.out.print("Menu: \n" +
                            "1. Display list customers\n" +
                            "2. Add new customer\n" +
                            "3. Edit customer\n" +
                            "4. Return main menu\n");
                    int choice2 = Integer.parseInt(sca.nextLine());
                    switch (choice2) {
                        case 1:
                            customerService.showList();
                            break;
                        case 2:
                            customerService.add();
                            break;
                        case 3:
                            customerService.edit();
                            break;
                        default:
                            System.out.println("Return main menu");
                    }
                    out = true;
                    break;
                case 3:
                    System.out.print("Menu: \n" +
                            "1. Display list facility\n" +
                            "2. Add new facility\n" +
                            "3. Display list facility maintenance\n" +
                            "4. Return main menu\n");
                    int choice3 = Integer.parseInt(sca.nextLine());
                    switch (choice3) {
                        case 1:
                            facilityService.showList();
                            break;
                        case 2:
                            System.out.print("Menu: \n" +
                                    "1.\tAdd New Villa\n" +
                                    "2.\tAdd New House\n" +
                                    "3.\tAdd New Room\n" +
                                    "4.\tBack to menu\n");
                            int choice6 = Integer.parseInt(sca.nextLine());
                            switch (choice6) {
                                case 1:
                                    break;
                                case 2:
                                    facilityService.addHouse();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Return main menu");
                            }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Return main menu");
                    }
                    out = true;
                    break;
                case 4:
                    System.out.print("Menu: \n" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    int choice4 = Integer.parseInt(sca.nextLine());
                    switch (choice4) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Return main menu");
                    }
                    out = true;
                    break;
                case 5:
                    System.out.print("Menu: \n" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    int choice5 = Integer.parseInt(sca.nextLine());
                    switch (choice5) {
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Return main menu");
                    }
                    out = true;
                    break;
                case 6:
                    System.out.println("Exit");
                    out = false;
                    break;
                default:
                    System.out.println("Wrong operation");
                    out = false;
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
