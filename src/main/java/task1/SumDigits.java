package task1;

class SumDigits {
    int sum(int number){
        char[] numberArray = Integer.toString(number).toCharArray();
        number=0;
        for (char n: numberArray) {
            number +=Integer.parseInt(String.valueOf(n));
        }
        return number;
    }
}