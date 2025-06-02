package pl.PP;

import java.util.Scanner;

public class mojaPiataAplikacja {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");

            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();


            if (lowerLimit > upperLimit) {
                System.out.println("Done");
                break;
            }


            long sum = 0;
            for (int i = lowerLimit; i <= upperLimit; i++) {
                sum += (long) i * i;
            }

            System.out.println("The sums of the squares from " + (lowerLimit * lowerLimit)
                    + " to " + (upperLimit * upperLimit)
                    + " is " + sum);


            System.out.println();
        }

        scanner.close();
    }
}