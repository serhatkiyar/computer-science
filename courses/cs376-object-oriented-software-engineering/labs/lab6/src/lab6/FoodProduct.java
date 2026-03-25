package lab6;

public class FoodProduct extends Product {

    private String expirationDate;

    public FoodProduct(String name, int stock, double price, String expirationDate) {
        super(name, stock, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage <= 0) {
            System.out.println("Geçersiz percentage değeri! İndirim uygulanamadı!");
        }
        else if (percentage > 5) {
            System.out.println("İndirim sınırı aşıldı! Gıda ürünleri için %5'ten fazla indirim yapılamaz.");
        }
        else {
            setPrice(getPrice() - getPrice() * percentage / 100);

        }
    }

    @Override
    public void applyDiscount() {
        applyDiscount(5);
    }

    @Override
    public void displayStatus() {
        System.out.printf("name: %s | id: %s | STT: %s | stock: %d\n", getName(), getId(), getExpirationDate(), getStock());
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
