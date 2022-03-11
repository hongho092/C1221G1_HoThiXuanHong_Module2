package ss19_string_regex.bai_tap;

public class Validate {
    public static boolean ValidateNameClass (String nameClass) {
        String regex = "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";
        return nameClass.matches(regex);
    }
    public boolean ValidatePhoneNumber (String phoneNumber) {
        String regex = "^\\d{2}-[0]{1}\\d{9}$";
        return phoneNumber.matches(regex);
    }
}
