package lab5;

public class Herbivore extends Animal{
    private int grassRequired;
    public Herbivore(String name, int age, boolean isFed, int grassRequired) {
        super(name, age, isFed);
        this.grassRequired = grassRequired;
    }

    @Override
    public void feedAnimal() {
        if (this.grassRequired > Animal.getGrassStock()) {
            System.out.printf("Yetersiz ot stoğu! Tavşan beslenemedi. ( Beklenen: [ %dg ], Mevcut: [ %dg ] )\n", grassRequired, Animal.getGrassStock());
        }
        else {
            System.out.printf("%s %dg ot ile beslendi.\n", getName(), this.grassRequired);
            Animal.setGrassStock(Animal.getGrassStock() - this.grassRequired);
            this.setFed(true);
        }
    }

}
