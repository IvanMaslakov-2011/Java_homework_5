package task_8;
import java.security.SecureRandom;

public class PasswordGenerator {

        private static final char[] SYMBOLS =
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}|;:,.<>?".toCharArray();
        private static final char[] SYMBOLS_SIMPLE =
            "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        private static final SecureRandom random = new SecureRandom();


        public String generateSimple(int length) {

            StringBuilder password = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                char randomChar = SYMBOLS_SIMPLE[random.nextInt(SYMBOLS_SIMPLE.length)];
                password.append(randomChar);
            }
            return password.toString();
        }

        public String generateStrong(int length) {
            StringBuilder password = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                char randomChar = SYMBOLS[random.nextInt(SYMBOLS.length)];
                password.append(randomChar);
            }
            return password.toString();
        }
}
