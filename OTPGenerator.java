import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Found a duplicate OTP
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        boolean unique = areUniqueOTPs(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
