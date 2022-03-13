package exercise.util;

import exercise.models.Vehicles;

public class Validate {
    public static boolean checkBienKiemSoatCar (String bienKiemSoat) {
            String regex = "^[0-9]{2}(A|B)-[0-9]{5}$";
            return bienKiemSoat.matches(regex);
    }

    public static boolean checkBienKiemSoatTruck (String bienKiemSoat) {
            String regex = "^[0-9]{2}C-[0-9]{5}$";
            return bienKiemSoat.matches(regex);
    }

    public static boolean checkBienKiemSoatMotorbike (String bienKiemSoat) {
            String regex = "^[0-9]{2}-Y[0-9|A-Z]-[0-9]{5}$";
            return bienKiemSoat.matches(regex);
    }
}
