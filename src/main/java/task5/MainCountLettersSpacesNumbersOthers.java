package task5;

import java.util.Scanner;

public class MainCountLettersSpacesNumbersOthers {
    public static void main(String[] args) {
        System.out.print("Input a String: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        CountLettersSpacesNumbersOthers count= new CountLettersSpacesNumbersOthers();
        System.out.println("Letter: " + count.countLetters(string));
        System.out.println("Space: " + count.countSpaces(string));
        System.out.println("Number: " + count.countNumbers(string));
        System.out.println("Other: " + count.countOther(string));
    }
}
