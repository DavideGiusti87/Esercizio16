/*
Generic Wildcards - 02
Exercise: generics-wildcards-2

define a GenericsClass using the diamond operator <T> that has:
a private attribute t of type T
a public method getT() method (with no parameters) that returns the current instance's t
a public method setT() method that:
takes a T parameter called valueToSet
assign the parameter's value to the current instance's t
a public static generics method isEqual() that:
takes two generics parameters in input:
a GenericsClass gc1
a GenericsClass gc2
uses Java's Object equals operator and the getT() method to understand if the two Object are equal:
please note that the equals() operator has the following syntax: object1.equals(object2)
returns a boolean (true if the two objects are equals, false if the two objects are not equals)
 */
public class GenericsClass <T> {
    private T t;

    public T getT(){
        return t;
    }
    public void setT(T valueToSet){
        this.t = valueToSet;
    }
    public static <T> boolean isEqual(T gc1, T gc2){
        return gc1.equals(gc2);
    }


}
