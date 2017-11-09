import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void move() {
    }

    @Test
    void turnLeft() {
    }

    @Test
    void turnRight() {
    }

    @Test
    void speedFactor() {
        Car car1 = new Saab95();
        car1.speedFactor();
        double output = car1.speedFactor();
        assertEquals(1.25, output);

    }

    @Test
    void gas() {
    }

    @Test
    void brake() {

    }

    @Test
    void startEngine() {
        Car car2 = new Volvo240();
        car2.startEngine();
        double output = car2.getCurrentSpeed();
        assertEquals(0.1, output);
    }

    @Test
    void stopEngine() {
        Car car1 = new Saab95();
        car1.stopEngine();
        double output = car1.getCurrentSpeed();
        assertEquals(0, output);

    }

}