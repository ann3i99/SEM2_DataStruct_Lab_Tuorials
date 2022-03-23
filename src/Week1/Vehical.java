package Week1;

// TUTORIAL QUESTION 4
public abstract class Vehical {

    private double maxSpeed;
    protected double currentSpeed;

    Vehical(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal(){
        if (currentSpeed == maxSpeed)
            return;
        else
            accelerate();

    }

}
