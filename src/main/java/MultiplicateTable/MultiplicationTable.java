package MultiplicateTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int firstDigit = 1; firstDigit <= 10; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= 10; secondDigit++) {
                System.out.print(secondDigit * firstDigit + " ");
            }
            System.out.println(" ");
        }
    }
}
