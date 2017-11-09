import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void setTurboOn() {
        Car car1 = new Volvo240();
        Car car2 = new Saab95();
        car1.setTurboOn();{assertFalse(car1.getTurboOn());}
        car2.setTurboOn();{assertTrue(car2.getTurboOn()); }

    }

    @Test
    void setTurboOff() {
        Car car1 = new Saab95();
        assertFalse(car1.getTurboOn());
        car1.setTurboOn();
        assertTrue(car1.getTurboOn());
        car1.setTurboOff();
        assertFalse(car1.getTurboOn());
    }

    @Test
    void getTurbo() {
    }

    @Test
    void move() {
        Car car1 = new Saab95();
        car1.startEngine();
        car1.move();
        double output = car1.getyPos();
        assertEquals(0.1, output);
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
        Car car1 = new Saab95();
        car1.gas(0.9);
        double output = car1.getCurrentSpeed();
        assertEquals(1.125, output);
    }

    @Test
    void brake() {
        Car car1 = new Volvo240();
        car1.brake(2);
        double output = car1.getCurrentSpeed();
        assertEquals(0, output);

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
