package task6;

public class MainNumberBetween1to100 {
    public static void main(String[] args) {
        int number =100;
        System.out.println("Divided by 3: ");
        new ShowNumbers().show(new NumberDivisible().numberDivisibleAt3(number));
        System.out.println("\nDivided by 5: ");
        new ShowNumbers().show(new NumberDivisible().numberDivisibleAt5(number));
        System.out.println("\nDivided by 3%5: ");
        new ShowNumbers().show(new NumberDivisible().numberDivisibleAt3and5(number));
    }
}
