package Week2;

//LAB QUESTION 1a


    //public class StorePairGeneric
    public class StorePair <E extends Comparable <E>> implements Comparable <StorePair<E>> {

        //private int first, second;
        private E first, second;

        //public StorePairGeneric(int first, int second){
        public StorePair(E first, E second) {
            this.first = first;
            this.second = second;
        }

        public E getFirst() {
            return first;
        }

        public E getSecond() {
            return second;
        }

        public void setPair(E first, E second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "first = " + first + " second = " + second;
        }

        @Override
        public int compareTo(StorePair<E> o) {
            return 0;
        }
    }

