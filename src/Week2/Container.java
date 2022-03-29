package Week2;

//QUESTION1

public class Container <T> {

    public Container(){}        //Create a no-arg constructor.

    private T t;                //Declare a private variable, t of type T.

    public void add(T t){       //Create a method, add that returns nothing, accepting parameter of generic type
        this.t=t;
    }

    public T retrieve(){        //generic method called retrieve() that returns the initially declared variable.
        return t;
    }

    public static void main(String[] args) {

        //Create two containers of type Integer and String.
        Container <Integer> contInteger = new Container<>();
        Container <String> contString = new Container<>();


        //Append two objects to the containers, one of type Integer having value 50, another of type String
        //having value Java.
        contInteger.add(50);
        contString.add("Java");


        // Display the Integer and String objects from the respective containers.
        System.out.println(contInteger.retrieve());
        System.out.println(contString.retrieve());

    }
}
