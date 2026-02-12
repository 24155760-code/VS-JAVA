import java.util.Scanner;

class Box {
    double l, w, h;

    double volume() {
        return l * w * h;
    }
}

public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        b.l = sc.nextDouble();
        b.w = sc.nextDouble();
        b.h = sc.nextDouble();

        System.out.println(b.volume());

        sc.close();
    }
}
