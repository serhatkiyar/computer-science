package lab6;

public class Main {
    public static void main(String[] args) {

        ElectronicProduct laptop = new ElectronicProduct("Laptop", 30,300, 12);
        FoodProduct sut = new FoodProduct("Süt", 10, 43, "13 Şubat 2027");

        laptop.displayStatus();
        sut.displayStatus();

        laptop.increaseStock(3);
        laptop.displayStatus();

        laptop.decreaseStock(10);
        laptop.displayStatus();
    }
}