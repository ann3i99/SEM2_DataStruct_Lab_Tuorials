package Week2;

//LAB QUESTION 2


//Create a generic class called MyGeneric that accepts one parameter
public class MyGeneric <T>{
    private T e;                    // Declare a variable called e

    MyGeneric(){}                   // Create a no-arg constructor

    public MyGeneric(T e){          //Create a constructor that accepts on generic parameter.
        this.e = e;
    }

    //Create a setter and getter method for the generic type.
    public T getE() {
        return e;
    }

    public void setE(T e){
        this.e=e;
    }


    //Create a test program that creates two instances of generic class of type String called strObj and
    //of type Integer called intObj. Set a value for each of these objects. Display these values using the
    //getter method.
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.setE("Anneisha");
        intObj.setE(22);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());

    }
}
