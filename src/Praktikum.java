import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        String result = "";
        if (isLeapYear(year)) {
            result = "12.09.";
        } else {
            result = "13.09.";
        }
        result += year;
        System.out.println(result);
    }
    public static boolean isLeapYear(int year) {
        boolean isLeap = year % 400 == 0 || (year % 4 == 0  && year % 100 != 0);
        return isLeap;
    }
}