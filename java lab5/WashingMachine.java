
interface Motor {

    int capacity = 5;   // data member (public static final by default)

    void run();
    void consume();
}

// Implementing class
public class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is running...");
    }

    public void consume() {
        System.out.println("Motor is consuming power...");
    }

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Checking value of interface data member
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}
