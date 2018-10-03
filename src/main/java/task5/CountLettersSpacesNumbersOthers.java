package task5;

public class CountLettersSpacesNumbersOthers {
    int countNumbers(String string){
        int number=0;
        char[] chars = string.toCharArray();
        for (Character c: chars) {
            if(Character.isDigit(c))
            number++;
        }
        return number;
    }

    int countSpaces(String string){
        int number=0;
        char[] chars = string.toCharArray();
        for (Character c:chars) {
            if(Character.isSpaceChar(c))
                number++;
        }
        return number;
    }

    int countLetters(String string){
        int number=0;
        char[] chars = string.toCharArray();
        for (Character c:chars) {
            if(Character.isLetter(c))
                number++;
        }
        return number;
    }

    int countOther(String string){
        CountLettersSpacesNumbersOthers count = new CountLettersSpacesNumbersOthers();
        int number = string.toCharArray().length;
        return number-count.countNumbers(string)
                - count.countLetters(string) - count.countSpaces(string);
    }
}
