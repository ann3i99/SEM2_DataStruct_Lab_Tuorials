package Week2;

//QUESTION 5,6,

public class Duo <A,B> {            //Create a generic class named Duo that has two parameters, A and B
    private A first;                // Declare a variable named first of type A, and the second variable named second of type B.
    private B second;


    //Create a constructor that accepts these
    //two parameters. In the constructor, assign these parameters respectively to the declared variables.
    Duo(A a, B b){
        first = a;          //First object called sideShape consist of respectively String type and Integer type.
        second = b;         //Second object called points consists of two Double types.
    }

    public static void main(String[] args) {
        Duo<Integer, String> sideShape = new Duo<>(10, "Annei");
        Duo<Double, Double> points = new Duo<>(1.1, 2.2);
    }

    //QUESTION 7
    //public static <T> void allTransportation(ArrayList<? extends T> list1, ArrayList<T> list)

    //QUESTION 8
    //public static void print(ArrayList<?> list) {
    // for(int i=0; i<list.size(); i++)
    // System.out.println(list.get(i));
    //}


}
