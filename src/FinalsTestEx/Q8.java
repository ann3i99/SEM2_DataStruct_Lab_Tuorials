package FinalsTestEx;

public class Q8 <T extends Comparable<T>> {
    int vertex;
    boolean edges [] [] ;

    public Q8(int v){
        this.vertex = v;
        edges = new boolean[v][v];
    }

    //public class Graph<T extends Comparable<T>> extends WeightedGraph;

    public void addEdge(int from, int to){
        edges[from][to] = true;
        edges[to][from] = true;

    }
    
    public void print(){
        System.out.println("Print the graph:");
        for(int i =0; i<vertex; i++){
            System.out.print(i + " -> ");
            for(int j = i;j<vertex; j++){
                if(edges[i][j])
                    System.out.print(j + " ");
            }
            System.out.println("End of the graph:");
        }
    }

    public static void main(String[] args) {


    }
}
