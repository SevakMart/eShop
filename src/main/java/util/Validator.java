package util;

public class Validator {

    public static boolean isEmpty(String value) {
        return value == null || "".equals(value);
    }
}
