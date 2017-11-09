import java.awt.*;
public abstract class Car implements Movable {
  protected int nrDoors;
  protected double enginePower;
  protected double currentSpeed;
  protected Color color;
  protected String modelName;
  protected boolean turboOn;
  protected double trimFactor;
  protected double turboPower;

  //MOVABLE VARS
  private double xPos = 0;
  private double yPos = 0;


    /**
     * Main
     * @param args
     */
  public static void main(String[] args){

  }

    /**
     * Contructor
     *
     */
    public Car() {

        Car car1 = new Saab95();
        Car car2 = new Volvo240();
    }

    //MOVABLE METHODS

  public void move() {
        yPos = currentSpeed;
  }


  public void turnLeft() {
     xPos += currentSpeed;
  }

  public void turnRight(){
        xPos -= currentSpeed;
  }



    /**
     * This method caluclate the cars total enginepower.
     * @return an equation.  enginePower * trimFactor * 0.01 * turbo
     */
    public double speedFactor() {
        double turbo = 1;
        if(turboOn) turbo = turboPower;
        return enginePower * 0.01 * trimFactor * turbo;
  }

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        try {
            if (1.0 < amount || amount < 0.0) {
                throw new Exception("Invalid amount");
            }
            incrementSpeed(amount);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    // TODO fix this method according to lab pm
    public void brake(double amount) {
        try {
            if (1.0 < amount || amount < 0.0) {
                throw new Exception("Invalid amount");
            }
            decrementSpeed(amount);
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
    /**
     * This method calucalet the current speed
     * @param amount
     */
    private void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
  }

    /**
     * This method lower the speed.
     * @param amount
     */
    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
  }

    /**
     * This method starts the engine by setting currentSpeed to 0.1
     */

    public void startEngine(){
        currentSpeed = 0.1;
  }

    /**
     * This method stops the engine by setting currentSpeed to 0.
     */
    public void stopEngine(){
        currentSpeed = 0;
  }

  /*GETTERS AND SETTERS*/
    public void setTurboOn() {
        turboOn = getTurbo(); // set the turbo to true if the car has a turbo
  }
    public void setTurboOff() {
        turboOn = false;
  }
    public boolean getTurbo() {
        return turboPower > 1;
  }
    public int getNrDoors(){
      return nrDoors;
  }
    public double getEnginePower(){
      return enginePower;
  }

    public double getCurrentSpeed(){
      return currentSpeed;
  }

    public Color getColor(){
      return color;
  }

    public void setColor(Color clr){
        color = clr;
  }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

  /*public void incrementSpeed(double amount){
      currentSpeed = getCurrentSpeed() + speedFactor() * amount;
  }

  public void decrementSpeed(double amount){
      currentSpeed = getCurrentSpeed() - speedFactor() * amount;
  }*/

}
