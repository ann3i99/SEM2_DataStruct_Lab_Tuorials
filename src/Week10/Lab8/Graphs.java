package Week10.Lab8;

import java.security.PublicKey;
import java.util.ArrayList;

public class Graphs <T extends Comparable<T>, N extends  Comparable <N>>{
    Vertex <T,N> head;
    int size;

    public Graphs(){
        head=null;
        size=0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean hasVertex(T v){
        if (head==null)
            return false;
        Vertex <T,N> temp = head;
        while (temp!=null) {
            if (temp.vertexInfo.compareTo(v) == 0)
                return true;
            temp=temp.nextVertex;
        }
        return false;
    }

    public int getIndeg (T v){
        if (hasVertex(v) == true){
            Vertex<T,N> temp = head;
            while (temp!=null){
                if (temp.vertexInfo.compareTo(v)==0)
                    return temp.indeg;
                temp=temp.nextVertex;
            }
        }
        return -1;
    }

//    public int getOutdeg(T v){
//
//    }

    public boolean addVertex(T v){
        if (hasVertex(v) == false){
            Vertex<T,N> temp = head;
            Vertex<T,N> newVertex = new Vertex<>(v,null);
            if (head == null)
                head = newVertex;
            else {
                Vertex<T,N> previous = head;
                while (temp!=null) {
                    previous = temp;
                    temp = temp.nextVertex;
                }
                previous.nextVertex=newVertex;
            }
            size++;
            return true;
        }
        else
            return false;
    }

    public int getIndex(T v){
        Vertex<T,N> temp = head;
        int pos = 0;
        while (temp!=null){
            if (temp.vertexInfo.compareTo(v) == 0)
                return pos;
            temp = temp.nextVertex;
            pos=pos+1;
        }
        return -1;
    }

    //return arraylist that store t
    public ArrayList<T> getAllVertexObj(){
        ArrayList<T> list = new ArrayList<>();
        Vertex<T,N> temp = head;
        while (temp!=null){
            list.add(temp.vertexInfo);
            //use add method of arrlist to add each vet info
            temp = temp.nextVertex;
        }
        return list;
    }

    public T getVertex (int pos){
        //if position is not valid
        if (pos>size-1 || pos<0)
            return null;
        Vertex<T,N> temp = head;
        for (int i = 0; i<pos; i++)
            temp = temp.nextVertex;
        return temp.vertexInfo;
    }

    public boolean hasEdge (T source, T destination){
        //if graph is empty
        if (head == null)
            return false;
        //if no such vertices
        if (hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        //IF COURSE VERTEX IS NOT FOUND GO NO NEXT ITERATION OF OUTER WHILE LOOP
        while (source != null){
            //SEARCH FOR EDGE IN VALID CONDITION
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                //REACHED SOURCE VERTEX, LOOK FOR DESTINATION NOW
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                //CREATE EDGE REF AND LOOK FOR DEST VERTEX IN SECOND WHILE LOOP
                while (currentEdge != null){
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0)
                        //destination vertex is found
                        return true;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
        //fins no such edge in previus loop
    }

    public boolean addEdge (T source, T destination, N w){
        if (head == null)
            return false;
        if (!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while (source != null){
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                //reached source vertex, look for destination now
                Vertex<T,N> destinationVertex = head;
                while (destinationVertex != null){
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0){
                        //reach destin vertex add edge
                        Edge<T,N> currentEdge = sourceVertex.firstEdge;
                        Edge<T,N> newEdge = new Edge<>(destinationVertex, w, currentEdge);
                        sourceVertex.firstEdge=newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex=destinationVertex.nextVertex;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return false;
    }

    public N getEdgeWeight(T source, T destination){
        N notFound = null;
        if (head == null)
            return notFound;
        if (!hasVertex(source) || !hasVertex(destination))
            return notFound;
        Vertex<T,N> sourceVertex = head;
        while (sourceVertex != null){
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                //reached source vert look for destination
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                while (currentEdge != null){
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) ==0)
                        //destination vert is found
                        return currentEdge.weight;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return notFound;
    }

    public ArrayList<T> getNeighbours (T v){
        if (!hasVertex(v))
            return null;
        ArrayList<T> list = new ArrayList<T>();
        Vertex<T,N> temp = head;
        while (temp!=null){
            if (temp.vertexInfo.compareTo(v)==0){
                //reached vert loo for destin
                Edge<T,N> currentEdge = temp.firstEdge;
                while (currentEdge != null){
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge=currentEdge.nextEdge;
                }
            }
            temp=temp.nextVertex;
        }
        return list;
    }

    public void printEdges(){
        Vertex<T,N> temp=head;
        while (temp!=null){
            System.out.println("# " + temp.vertexInfo + " : " );
            Edge<T,N> currentEdge = temp.firstEdge;
            while (currentEdge !=null){
                System.out.println(" [ " + temp.vertexInfo + " ," + currentEdge.toVertex.vertexInfo + "] ");
                currentEdge=currentEdge.nextEdge;
            }
            System.out.println();
            temp=temp.nextVertex;
        }
    }


}
