package lab4;

public class MenuItem {
    private String name;
    private int price;


    public MenuItem(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public MenuItem(String name) {
        this.name = name;
        System.out.printf("[%s] Fiyat bilgisi girilmedi!\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Fiyat negatif olamaz!");
            return;
        }

        this.price = price;
    }

    public void displayDetails() {
        System.out.printf("Name %-12s | Price %-12d\n",
                name,
                price);
    }
}
