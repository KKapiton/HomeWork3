package SimpleNumber;

import java.util.Scanner;

public class ScannerSimple {
    public static void main(String[] args) {
        int temp;
        boolean DIGIT1 = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        int num = scan.nextInt();
        for (int a = 2; a <= num / 2; a++) {
            temp = num % a;
            if (temp == 0) {
                DIGIT1 = false;
                break;
            }
        }
        if (DIGIT1) {
            System.out.println(num + " - простое число"); }
         else {
            System.out.println(num + " - НЕ простое число");
        }
    }
}