import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            exit = isPasswordValid(getPassword());
        }
    }

    public static String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your new password: ");
        String password = scanner.nextLine();
        return password;
    }

    public static boolean isPasswordValid(String password) {
        if ((checkLength(password)) && (hasDigit(password)) && (hasUppercase(password)) && (hasLowercase(password))) {
            System.out.println("Password saved.");
            return true;
        } else {
            System.out.println("The password you have chosen is not secure enough.\n Password needs to be at least 8 characters long and contain at least 1 number, 1 lowercase and 1 uppercase letter. \n Please choose another password.");
            return false;
        }
    }

    public static boolean checkLength(String password) {
        int minLength = 8;
        int passwordLength = password.length();
        if (passwordLength >= minLength) {
            return true;
        } else {
            return false;
        }
    }

    /*

    public static boolean hasDigit(String password) {
        char[] charArr = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(charArr[i])) return true;
        }
        return false;
    }
    */

    public static boolean hasDigit (String password) {
        char[] charArr = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(charArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasUppercase(String password) {
        char[] charArr = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(charArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowercase(String password) {
        char[] charArr = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(charArr[i])) return true;
        }
        return false;
    }

    public static int addMe (int a, int b) {
        return a + b;
    }

    //public static boolean stupidPassword (String password) {

    //}

}
