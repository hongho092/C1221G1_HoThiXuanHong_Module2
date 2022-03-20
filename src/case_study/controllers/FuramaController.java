package case_study.controllers;

import case_study.services.Iplm.check_in_iplm.BookingServiceImpl;
import case_study.services.Iplm.person_iplm.CustomerServiceImpl;
import case_study.services.Iplm.person_iplm.EmployeeServiceImpl;
import case_study.services.Iplm.facility_iplm.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static Scanner sca = new Scanner(System.in);
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static BookingServiceImpl bookingService = new BookingServiceImpl();
    public static void displayMainMenu() {
        boolean out = false;
        while (!out) {
            int choice = -1;
            System.out.print("Menu: \n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Your choice -> ");
            try {
                choice = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.out.println("Exit");
                    out = true;
                    break;
                default:
                    System.out.println("Enter from 1 to 6.");
            }
        }
    }

    public static void displayEmployeeManagement () {
        boolean out = false;
        while (!out) {
            int choice1 = -1;
            System.out.print("Menu: \n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n");
            try {
                choice1 = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice1) {
                case 1:
                    employeeService.showList(); break;
                case 2:
                    employeeService.add(); break;
                case 3:
                    employeeService.edit(); break;
                case 4:
                    System.out.println("Return main menu"); out = true; break;
                default:
                    System.out.println("Enter from 1 to 4.");
            }
        }
    }

    public static void displayCustomerManagement () {
        boolean out = false;
        while (!out) {
            int choice2 = -1;
            System.out.print("Menu: \n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n");
            try {
                choice2 = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice2) {
                case 1:
                    customerService.showList(); break;
                case 2:
                    customerService.add(); break;
                case 3:
                    customerService.edit(); break;
                case 4:
                    System.out.println("Return main menu"); out = true; break;
                default:
                    System.out.println("Enter from 1 to 4.");
            }
        }
    }

    public static void displayFacilityManagement () {
        boolean out = false;
        while (!out) {
            int choice3 = -1;
            System.out.print("Menu: \n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n");
            try {
                choice3 = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice3) {
                case 1:
                    facilityService.showList(); break;
                case 2:
                    displayAddNewFacility(); break;
                case 3:
                    break;
                case 4:
                    System.out.println("Return main menu"); out = true; break;
                default:
                    System.out.println("Enter from 1 to 4.");
            }
        }
    }

    public static void displayAddNewFacility () {
        boolean out = false;
        while (!out) {
            int choice6 = -1;
            System.out.print("Menu: \n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            try {
                choice6 = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice6) {
                case 1:
                    facilityService.addVilla(); break;
                case 2:
                    facilityService.addHouse(); break;
                case 3:
                    facilityService.addRoom(); break;
                case 4:
                    System.out.println("Return main menu"); out = true; break;
                default:
                    System.out.println("Enter from 1 to 4.");
            }
        }
    }

    public static void displayBookingManagement () {
        boolean out = false;
        while (!out) {
            int choice4 =-1;
            System.out.print("Menu: \n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            try {
                choice4 = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice4) {
                case 1:
                    bookingService.add();
                    break;
                case 2:
                    bookingService.showList();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Return main menu"); out = true;
                default:
                    System.out.println("Enter from 1 to 6");
            }
        }
    }

    public static void displayPromotionManagement () {
        boolean out = false;
        while (!out) {
            int choice5 = -1;
            System.out.print("Menu: \n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            try {
                choice5 = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Wrong format, enter again.");
            }
            switch (choice5) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Return main menu"); out = true;
                default:
                    System.out.println("Enter from 1 to 3.");
            }
        }
    }
}
