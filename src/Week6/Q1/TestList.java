package Week6.Q1;

public class TestList {
    public static void main(String[] args) {
        SList<String> list = new SList<String>();

        //1) Append the following values individually: “Linked list, is, easy.”
        System.out.println("APPEND LIST:");
        list.appendEnd("Linked");
        list.appendEnd("list");
        list.appendEnd("is");
        list.appendEnd("easy!!!!!!!");

//        2) Display these values.
        list.display();

//        3) Remove the word “Linked list” and display the removed value.
        System.out.println();

        System.out.println("\nREMOVE FROM LIST:");
        list.removeInitial();
        list.removeInitial();

        list.display();

//        4) Check if ‘difficult’ is in the list.
        System.out.println();
        System.out.println("\nCHECK LIST");
        System.out.println(list.contains("difficult"));
        //System.out.println(list.contains("is"));

//        5) Clear the list.
        System.out.println("\nCLEAR LIST:");
        list.clear();
        list.display();
    }
}
