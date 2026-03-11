package lab3;

public class Main {
    public static void main(String[] args) {
        Car testCar = new Car("Mercedes", 5, 200, 20.5, 0.02);

        testCar.start();

        for (int i = 1; i <= 15; i++) {
            System.out.println("* [iterasyon " + i + "]");
            testCar.accelerate();

            if (i == 14) {
                testCar.brake();
            }

            System.out.println();

        }
    }
}