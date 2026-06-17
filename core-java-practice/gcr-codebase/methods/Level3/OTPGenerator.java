package Methods;

public class OTPGenerator {

    // Generate 6-digit OTP
    public static int generateOTP() {

        return (int) (Math.random() * 900000) + 100000;
    }

    // Check whether all OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {

        for (int first = 0;
             first < otpArray.length;
             first++) {

            for (int second = first + 1;
                 second < otpArray.length;
                 second++) {

                if (otpArray[first]
                        == otpArray[second]) {

                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        final int OTP_COUNT = 10;

        int[] otpArray =
                new int[OTP_COUNT];

        // Generate OTPs
        for (int index = 0;
             index < otpArray.length;
             index++) {

            otpArray[index] =
                    generateOTP();
        }

        System.out.println(
                "Generated OTPs:\n");

        for (int otp : otpArray) {

            System.out.println(otp);
        }

        boolean unique =
                areOTPsUnique(otpArray);

        System.out.println(
                "\nAll OTPs Unique = "
                        + unique);
    }
}
