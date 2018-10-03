package task7;

import java.util.ArrayList;
import java.util.List;

public class ManipulateWithArrayObjects {
    List<Person> createListOfPerson(Object... objects) {
        List<Person> list = new ArrayList<Person>();
        for (Object o : objects) {
            if (o.getClass() == Person.class) {
                list.add((Person) o);
            }
        }
        return list;
    }

    Number sumOfAllNumbers(Object... objects)  {
        int sumInt = 0;
        double sumDoub = 0;
        long sumLong = 0;
//        Number sumNumber1 =0;
        for (Object o : objects){
            if(o.getClass()==Integer.class){
                sumInt+=(Integer) o;
            }
            if (o.getClass()==Double.class){
                sumDoub+=(Double)o;
            }
            if (o.getClass()==Long.class){
                sumDoub+=(Long)o;
            }
//            if (o.getClass()==Number.class){  // don't work, why?
//                sumNumber1+=(Number)o;
//            }
        }
        Number sumNumber = sumInt+sumDoub+sumLong;
        return sumNumber;
    }

    StringBuilder concatenationString(Object... objects){
        StringBuilder newString = new StringBuilder();
        for (Object o: objects) {
            if(o.getClass()==String.class || o.getClass()==Character.class){
                newString.append(o + " ");
            }
        }
        return newString;
    }
}
