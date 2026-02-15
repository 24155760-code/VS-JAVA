import java.util.Scanner;

// 2D class
class Sheet2D {
    double length;
    double width;

    // Constructor
    Sheet2D(double l, double w) {
        length = l;
        width = w;
    }

    double calculateCost() {
        return length * width * 40;   // Rs 40 per square ft
    }
}

// 3D class inheriting 2D
class Box3D extends Sheet2D {
    double height;

    // Constructor
    Box3D(double l, double w, double h) {
        super(l, w);   // call parent constructor
        height = h;
    }

    double calculateCost3D() {
        return length * width * height * 60;  // Rs 60 per cubic ft
    }
}

public class PlasticCost {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D Sheet
        System.out.println("Enter length and width of 2D sheet:");
        double l1 = sc.nextDouble();
        double w1 = sc.nextDouble();

        Sheet2D sheet = new Sheet2D(l1, w1);
        System.out.println("Cost of 2D Sheet: Rs " + sheet.calculateCost());

        // 3D Box
        System.out.println("Enter length, width and height of 3D box:");
        double l2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h = sc.nextDouble();

        Box3D box = new Box3D(l2, w2, h);
        System.out.println("Cost of 3D Box: Rs " + box.calculateCost3D());

        sc.close();
    }
}
