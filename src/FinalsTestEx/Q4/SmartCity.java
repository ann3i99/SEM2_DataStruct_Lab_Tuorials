package FinalsTestEx.Q4;

import java.util.PriorityQueue;
import java.util.Queue;

public class SmartCity {
    public static void main(String[] args) {
        //creating priorityQueue for storing PassengerInformation
        PriorityQueue<PassInfo> priorityQueue = new PriorityQueue<PassInfo>();

        //Adding passenger information to priorityQueue
        priorityQueue.add(new PassInfo("Susan", "Road 0.9"));
        priorityQueue.add(new PassInfo("Jack", "Road 5.5"));
        priorityQueue.add(new PassInfo("Benjamin", "Road 1.6"));
        priorityQueue.add(new PassInfo("Rachel", "Road 3.8"));
        priorityQueue.add(new PassInfo("Samuel", "Road 4.1"));
        priorityQueue.add(new PassInfo("Kenneth", "Road 2.6"));

        System.out.println("Passenger Drop-off List");
        //Extracting pasenger one by one form PriorityQueue.
        while (!priorityQueue.isEmpty()) {
            PassInfo temp = priorityQueue.poll();
            System.out.println("Stop " + temp.dropLocation + ": " + temp.name);
        }
    }

}
