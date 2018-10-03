package task4;

import java.util.Scanner;

public class MainPolindrom {
    public static void main(String[] args) {
        System.out.print("Input a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Word ( "+word+" ) is polindrom? \n Status: "
                + new CheckPolindrom().checkPolindrom(word));
    }
}
