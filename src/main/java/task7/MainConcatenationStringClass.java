package task7;

public class MainConcatenationStringClass {
    public static void main(String[] args){
        Object[] listOfObject = {1111,"Cit",new Person("Luciana","female",19)
                ,3333,"mai","sus",(long)4,0.5,new Person("Eugen","Male",21),'!'};
        System.out.println("Sum of all number: " + new ManipulateWithArrayObjects().sumOfAllNumbers(listOfObject));
        System.out.println("List of Persons: " + new ManipulateWithArrayObjects().createListOfPerson(listOfObject));
        System.out.println("String concatenation: " + new ManipulateWithArrayObjects().concatenationString(listOfObject));
    }
}
