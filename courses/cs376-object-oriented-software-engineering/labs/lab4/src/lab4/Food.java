package lab4;

public class Food extends MenuItem{
    private boolean isSpicy;

    public Food(String name, int price, boolean isSpicy) {
        super(name, price);
        this.isSpicy = isSpicy;
    }

    public Food(String name, boolean isSpicy) {
        super(name);
        this.isSpicy = isSpicy;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Name %-12s | Price %-12d | isSpicy %-12b\n",
                this.getName(),
                this.getPrice(),
                isSpicy);
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
}
