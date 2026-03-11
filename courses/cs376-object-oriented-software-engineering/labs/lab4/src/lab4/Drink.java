package lab4;

public class Drink extends MenuItem{
    private String size;

    public Drink(String name, int price, String size) {
        super(name, price);
        this.size = size;
    }

    public Drink(String name, String size) {
        super(name);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Name %-12s | Price %-12d | Size %-12s\n",
                this.getName(),
                this.getPrice(),
                size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
