package Week2;

//LAB QUESTION 5

public class FindMax {

    public static class Cirlce implements Comparable<Cirlce> {
        double radius;

        public Cirlce(double radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(Cirlce c) {
            if (radius < c.radius)
                return -1;
            else if (radius == c.radius)
                return 0;
            else
                return 1;
        }
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"red", "green", "blue"};
        Cirlce[] c = {new Cirlce(3), new Cirlce(2.9), new Cirlce(5.9)};

        System.out.println();
        System.out.println(max(b));
        System.out.println(max(c));
    }
}