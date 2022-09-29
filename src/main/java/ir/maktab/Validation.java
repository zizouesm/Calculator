package ir.maktab;

public class Validation {

    public static boolean checkValidation(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
