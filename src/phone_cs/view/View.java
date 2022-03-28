package phone_cs.view;

import phone_cs.controllers.PhoneController;

public class View {
    public static void main(String[] args) {
        PhoneController phoneController = new PhoneController();
        phoneController.displayMainMenu();
    }
}
