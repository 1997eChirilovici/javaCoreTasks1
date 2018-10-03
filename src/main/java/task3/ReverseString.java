package task3;

class ReverseString {
    String reverseString(String string){
        char[] charArray = string.toCharArray();
        int size = charArray.length;
        char[] newCharArry = new char[size];
        for (int i =0 ; i<size ; i++) {
            newCharArry[size-1-i]=charArray[i];
        }
        return new String(newCharArry);
    }
}
