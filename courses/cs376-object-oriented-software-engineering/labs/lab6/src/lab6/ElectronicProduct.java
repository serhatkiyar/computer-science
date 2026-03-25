package lab6;

public class ElectronicProduct extends Product{
    private int warrantyPeriod;

    public ElectronicProduct(String name, int stock, double price, int warrantyPeriod) {
        super(name, stock, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage <= 0) {
            System.out.println("Geçersiz percentage değeri! İndirim uygulanamadı!");
        }
        else if (percentage > 20) {
            System.out.println("İndirim sınırı aşıldı! Elektronik ürünler için %20'den fazla indirim yapılamaz.");
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
        System.out.printf("isim: %s | id: %s | garanti: %d | stock: %d\n", getName(), getId(), this.getWarrantyPeriod(),this.getStock());
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
