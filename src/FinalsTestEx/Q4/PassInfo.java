package FinalsTestEx.Q4;

public class PassInfo implements Comparable<PassInfo>{
    String name;
    String road;
    double distance;
    String dropLocation;

    public PassInfo(String name, String roadDistance){
        this.name = name;
        String str[] = roadDistance.split(" ");
        //str[] = {"Road", "0.9"}
        this.road = str[0];
        this.distance = Double.parseDouble(str[1]); //= 0.9
        this.dropLocation = findDropLocation();
    }

    // returns dropLocation(BusStop) based on which bus stop is nearest. BusStop positionis given in problem statement
    private String findDropLocation() {
        String dropLoc;
        if (this.distance > 0.2 && 1.2 >= this.distance) {
            dropLoc = "A";
        } else if (this.distance > 1.2 && this.distance <= 2.2) {
            /*if ((this.distance - 1.2) <=  (2.2 - this.distance))
                dropLoc = "A";
            else
                dropLoc = "B";*/
            dropLoc = ((this.distance - 1.2) <= (2.2 - this.distance)) ? "A" : "B";
        } else if (this.distance > 2.2 && this.distance <= 3.2) {
            dropLoc = ((this.distance - 2.2) <= (3.2 - this.distance)) ? "B" : "C";
        } else if (this.distance > 3.2 && this.distance <= 4.2) {
            dropLoc = ((this.distance - 3.2) < (4.2 - this.distance)) ? "C" : "D";
        } else if (this.distance > 4.2 && this.distance <= 5.2) {
            dropLoc = ((this.distance - 4.2) < (5.2 - this.distance)) ? "D" : "E";
        } else {
            dropLoc = "E";
        }
        return dropLoc;
    }

    //@Override
    public int compareTo(PassInfo o) {
        //this.dropLocation == A
        //o.dropLocation == B
        if (this.dropLocation.compareTo(o.dropLocation) < 0) {
            return -1;
        } else if (this.dropLocation.compareTo(o.dropLocation) > 0) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setName(String name) {
        this.name = name;
    }
}
