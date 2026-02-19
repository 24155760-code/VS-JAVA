package mypack;
interface Greeting {
    void sayHello();
}

public class GreetingDemo {

    public static void main(String[] args) {

        // Anonymous Inner Class
        Greeting g = new Greeting() {

            public void sayHello() {
                System.out.println("Hello! Welcome to Java Programming 😊");
            }
        };

        g.sayHello();  // Calling the method
    }
}
