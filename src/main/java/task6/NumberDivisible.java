package task6;

public class NumberDivisible {

    int[] numberDivisibleAt3(int number){
        int countur=0;
        for(int i=1;i<=number;i++){
            if (i%3==0)
                countur++;
        }
        int[] arrayNumbers = new int[countur];
        int j=0;
        for(int i=1;i<=number;i++){
            if (i%3==0) {
                arrayNumbers[j] = i;
                j++;
            }
        }
        return  arrayNumbers;
    }

    int[] numberDivisibleAt5(int number){
        int countur=0;
        for(int i=1;i<=number;i++){
            if (i%5==0)
                countur++;
        }
        int[] arrayNumbers = new int[countur];
        int j=0;
        for(int i=1;i<=number;i++){
            if (i%5==0) {
                arrayNumbers[j] = i;
                j++;
            }
        }
        return  arrayNumbers;
    }

    int[] numberDivisibleAt3and5(int number){
        int countur=0;
        for(int i=1;i<=number;i++){
            if (i%5==0&&i%3==0)
                countur++;
        }
        int[] arrayNumbers = new int[countur];
        int j=0;
        for(int i=1;i<=number;i++){
            if (i%5==0&&i%3==0) {
                arrayNumbers[j] = i;
                j++;
            }
        }
        return  arrayNumbers;
    }

}
