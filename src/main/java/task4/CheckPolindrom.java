package task4;

public class CheckPolindrom {
    boolean checkPolindrom(String string){
        char[] chars = string.toCharArray();
        int size = chars.length;
        for (int i=0; i<size; i++){
            if(chars[i]!=chars[size-1-i])
                return false;
        }
        return true;
    }
}
