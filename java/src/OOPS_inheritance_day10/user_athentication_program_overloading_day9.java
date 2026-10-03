package OOPS_inheritance_day10;

class UserAuthentication {

    // 1. Login using Email and Password
    void login(String email, String password) {

        String correctEmail = "user@gmail.com";
        String correctPassword = "12345";

        System.out.println("Authentication Method : Email + Password");

        if (email.equals(correctEmail) && password.equals(correctPassword)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Email or Password");
        }

        System.out.println("-----------------------------");
    }

    // 2. Login using Phone Number and OTP
    void login(long phone, int otp) {

        long correctPhone = 9876543210L;
        int correctOTP = 1234;

        System.out.println("Authentication Method : Phone + OTP");

        if (phone == correctPhone && otp == correctOTP) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Phone Number or OTP");
        }

        System.out.println("-----------------------------");
    }

    // 3. Login using Social ID
    void login(String socialId) {

        String correctSocialId = "google_123";

        System.out.println("Authentication Method : Social ID");

        if (socialId.equals(correctSocialId)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Social ID");
        }

        System.out.println("-----------------------------");
    }
}

//Main class
public class user_athentication_program_overloading_day9 {

	public static void main(String[] args) {
		 UserAuthentication user = new UserAuthentication();

	        // 1. Email + Password
	        user.login("user@gmail.com", "12345");

	        // 2. Phone + OTP
	        user.login(9876543210L, 1234);

	        // 3. Social ID
	        user.login("google_123");
	    }
	}

	