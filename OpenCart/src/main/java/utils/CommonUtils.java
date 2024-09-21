package utils;

import java.util.Date;
import java.util.Random;

public class CommonUtils {

    public static final int IMPLICIT_WAIT_TIME = 10;
    public static final int PAGE_LOAD_TIME = 10;
    public static final int EXPLICIT_WAIT_BASIC_TIME = 10;

    // Generate a random email
    public static String randomEmailGenerator() {
        Date date = new Date();
        String generatedEmail = "shuvo" + date.toString().replace(" ", "_").replace(":", "_") + "@gmail.com";
        return generatedEmail;
    }
    
    private static String[] credentials = {
            "shuvo123@gmail.com",
            "Password123!"
        };

        public static String getGeneratedEmail() {
            return credentials[0];
        }

        public static String getGeneratedPassword() {
            return credentials[1];
        }
}
