package mypack;
class Bank {

    double principal = 10000;   
    double rate = 5;            
    int time = 2;               

    // Static Nested Class
    static class InterestCalculator {

        // Static method to calculate simple interest
        static double calculateSI(double p, double r, int t) {
            return (p * r * t) / 100;
        }

        void showError() {
           
            System.out.println("Cannot access non-static members directly from static nested class.");
        }
    }

    public static void main(String[] args) {
        double si = InterestCalculator.calculateSI(10000, 5, 2);

        System.out.println("Simple Interest = " + si);

        InterestCalculator obj = new InterestCalculator();
        obj.showError();
    }
}
