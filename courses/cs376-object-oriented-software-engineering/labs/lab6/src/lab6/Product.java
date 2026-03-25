package lab6;

public class Product {
    private String name;
    private String id;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.id = generateProductId();
        this.stock = stock;
        this.price = price;
    }

    public void increaseStock(int amount) {
        if (amount <= 0) {
            System.out.println("Geçersiz amount değeri!");
        }
        else {
            this.stock += amount;
        }
    }

    public void decreaseStock(int amount) {

        if (amount <= 0) {
            System.out.println("Geçersiz amount değeri!");
        }
        else if (stock < amount) {
            System.out.println("Geçersiz amount değeri! Stok aşıldı!");
        }
        else {
            this.stock -= amount;
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage <= 0) {
            System.out.println("Geçersiz percentage değeri! İndirim uygulanamadı!");
            return;
        }
        price = price - price * percentage / 100;
    }

    public void applyDiscount() {
        applyDiscount(5);
    }

    private String generateProductId() {
        int num = (int) (Math.random() * 900000) + 100000;
        return "PRD-" + num;
    }

    public void displayStatus() {
        System.out.printf("name: %s | id: %s \n", this.name, this.id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

}
