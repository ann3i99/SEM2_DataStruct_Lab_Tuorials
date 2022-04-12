package Week2;

//LAB QUESTION 5

public class FindMax {



    public static class Cirlce implements Comparable <Cirlce> {
        double radius;

        public Cirlce (double radius){
            this.radius=radius;
        }

        @Override
        public int compareTo(Cirlce o) {
            return 0;
        }
    }
}
