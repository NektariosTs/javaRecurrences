package repeat.chapters.chapter2;

import java.util.Scanner;

/**
 * calculates the price with vat.
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double vat = 0.24;
        double price = 0;
        double inputPrice = 0;

        System.out.println("insert the price");
        inputPrice = scanner.nextDouble();
//        price = scanner.nextDouble();

        inputPrice = (inputPrice * vat) + inputPrice;

        System.out.println("the price is: " + inputPrice);
    }
}
