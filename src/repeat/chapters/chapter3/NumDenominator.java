package repeat.chapters.chapter3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("please insert numerator");
            numerator  = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("numeator is zero.Quiting");
                break;
            }

            System.out.println("insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("denominator must not be zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("result " + result);
        }
    }
}
