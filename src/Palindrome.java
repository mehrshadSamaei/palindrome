import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your value");
            String value = sc.next();
            checkPalindrome(value);
            System.out.println("if don't you want continue check ");
            System.out.println("plz just enter no");
            String guidUser = sc.next();
            if (guidUser.equals("no"))
                flag = false;
            System.out.println("bye");
        } while (flag);
    }

    private static boolean checkPalindrome(String value) {
        String temp = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            temp += value.charAt(i);
        }
        if (!value.equals(temp)) {
            System.out.println("this value not palindrome");
            return false;
        }
        if (value.equals(temp)) {
            System.out.println("this value is palindrome");
        }
        return true;
    }

}