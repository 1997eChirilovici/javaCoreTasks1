package task2;

import java.util.Scanner;

public class MainTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input 2nd number: ");
        int number2 = scanner.nextInt();
        NumbersManipulated numbersManipulated = new NumbersManipulated();
        System.out.println("Sum of two integer: " + numbersManipulated.sum(number1,number2));
        System.out.println("Difference of two integers: " + numbersManipulated.diff(number1,number2));
        System.out.println("Product of two integers: " + numbersManipulated.product(number1,number2));
        System.out.println("Average of two integers: " + numbersManipulated.average(number1,number2));
        System.out.println("Distance of two integers: " + numbersManipulated.distance(number1,number2));
        System.out.println("Max integer: " + numbersManipulated.max(number1,number2));
        System.out.println("Min integer: " + numbersManipulated.min(number1,number2));
    }
}
