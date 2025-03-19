package repeat.chapters.chapter3;

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while (true) {
            System.out.println("insert number");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }
            System.out.println("Bingo!");
            break;

        }
    }
}
