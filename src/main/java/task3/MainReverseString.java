package task3;

import java.util.Scanner;

public class MainReverseString {
    public static void main(String[] args) {
        System.out.print("Input a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(new ReverseString().reverseString(string));
    }
}
