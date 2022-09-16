import java.util.Scanner;

    public class Praktikum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int year = scanner.nextInt();

            if (isLeapYear(year)) {
                System.out.println("12.09." + year + ".");// здесь нужно вывести результат
            } else {
                System.out.println("13.09." + year + ".");
            }
        }

        public static boolean isLeapYear(int year) {
            if (year % 400 == 0) {
                return true;// здесь нужно определить, является ли переданный год високосным
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

