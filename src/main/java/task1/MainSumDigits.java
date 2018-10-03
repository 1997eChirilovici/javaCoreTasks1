package task1;

import java.util.Scanner;

public class MainSumDigits {
    public static void main(String[] args) {
        System.out.println("Input an integer between 0 and 1000");
        Scanner scanner =new Scanner(System.in);
        System.out.println("response: "+new SumDigits().sum(scanner.nextInt()));
    }
}
