package repeat.chapters.chapter3;

import java.util.Scanner;

/**
 * checks if an integer is even
 */
public class IsEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("insert a number");
        num = scanner.nextInt();

        isEven = num % 2 == 0;

        System.out.printf("%d is even: %b", num, isEven);
    }
}
