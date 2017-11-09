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
  private double xPos;
  private double yPos = 1;
  private double direction;

    /**
     * Main
     * @param args
     */
  public static void main(String[] args){

  }

    /**
     * Contructor
     * @param xPos
     * @param yPos
     */
    public Car(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        Car car1 = new Saab95();
        Car car2 = new Volvo240();

    }

    //MOVABLE METHODS

  public void move() {
        startEngine();
        if(direction > 0 ){
            xPos += currentSpeed;
        }
        else if(direction < 0 ){
            xPos -= currentSpeed;
        }
        else if(direction == 0){
            yPos += currentSpeed;
        }
        else yPos -= currentSpeed;
  }

  public void direction(double newXPos, double newYPos) {
      this.direction = ((newXPos - xPos) / (newYPos - yPos));
      this.xPos = newXPos;
      this.yPos = newYPos;
  }

  public void turnLeft(double newXPos) {
     /* if(direction > 0 && xPos > newXPos){
          this.xPos = xPos--;

      }
      else if(direction < 0 && xPos < newXPos){
          this.xPos = xPos++;
      }
      else if(direction == 0 && xPos < newXPos){
          this.yPos = yPos--;

      }
      else if(direction == 0 && xPos > newXPos){
          this.yPos = yPos++;
      }*/

  }
    public void turnRight(double newXPos) {
        /*if(direction > 0 && xPos > newXPos){
            this.xPos = xPos++;

        }
        else if(direction < 0 && xPos < newXPos){
            this.xPos = xPos--;
        }
        else if(direction == 0 && xPos < newXPos){
            this.yPos = yPos++;

        }
        else if(direction == 0 && xPos > newXPos){
            this.yPos = yPos--;
        }
        */


    }




    /**
     * This method caluclate the cars total enginepower.
     * @return an equation.  enginePower * trimFactor * 0.01 * turbo
     */
    private double speedFactor() {
        double turbo = 1;
        if(turboOn) turbo = turboPower;
        return enginePower * 0.01 * trimFactor * turbo;
  }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
  }
    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
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

  /*public void incrementSpeed(double amount){
      currentSpeed = getCurrentSpeed() + speedFactor() * amount;
  }

  public void decrementSpeed(double amount){
      currentSpeed = getCurrentSpeed() - speedFactor() * amount;
  }*/

}
