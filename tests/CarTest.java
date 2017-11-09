import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void speedFactor() {
        Car car3 = new Saab95();
        double output = car3.speedFactor();
        assertEquals(1.25, output);
    }

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
    void gas() {
    }

    @Test
    void brake() {
    }

    @Test
    void startEngine() {
    }

    @Test
    void stopEngine() {
    }

}