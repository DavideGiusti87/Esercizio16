/*
Generic Wildcards - 02
Exercise: generics-wildcards-2

define a testing class with a main() method where you:
create 4 new GenericsClass objects where T is:
Integer for firstElement and secondElement
String for thirdElement and fourthElement
assign the following object-value using the setT() method:
firstElement will have an int value 12
secondElement will have an int value 13
thirdElement and fourthElement will have the same String value "This is a string"
call the static method isEqual() for answering the following two comparisons (and notify the user):
first element is equal to second element?
third element is equal to fourth element?
 */
public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> firstElement = new GenericsClass<Integer>();
        GenericsClass<Integer> secondElement = new GenericsClass<Integer>();
        GenericsClass<String> thirdElement = new GenericsClass<String>();
        GenericsClass<String> fourthElement = new GenericsClass<String>();
        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");
        System.out.println(GenericsClass.isEqual("'firstElement' and 'secondElement' are equal: "+firstElement.getT(),secondElement.getT()));
        System.out.println(GenericsClass.isEqual("'thirdElement' and 'fourthElement' are equal: "+thirdElement.getT(),fourthElement.getT()));
    }
}
