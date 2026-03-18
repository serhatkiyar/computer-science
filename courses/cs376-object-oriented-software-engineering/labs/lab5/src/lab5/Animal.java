package lab5;

public abstract class Animal {
    private String name;
    private int age;
    private String animalID;
    private static int count = 1000;
    private boolean isFed;
    private static int meatStock = 10000;
    private static int grassStock = 10000;

    public Animal(String name, int age, boolean isFed) {
        this.name = name;
        this.age = age;
        this.animalID = this.generateAnimalId();
        this.isFed = isFed;
    }

    public void checkStatus() {
        System.out.printf("isFed: %b", this.isFed);
    }
    public void feedAnimal(){}

    public static void showStock() {
        System.out.printf("Meat Stock: %dg | Grass Stock: %dg\n", Animal.getMeatStock(), Animal.getGrassStock());
    }

    private String generateAnimalId() {
        String id = "ANL-" + Integer.toString(count);
        Animal.count++;
        return id;
    }

    public String getAnimalID() {
        return animalID;
    }


    public static int getMeatStock() {
        return Animal.meatStock;
    }

    public static void setMeatStock(int meatStock) {
        Animal.meatStock = meatStock;
    }

    public static int getGrassStock() {
        return Animal.grassStock;
    }

    public static void setGrassStock(int grassStock) {
        Animal.grassStock = grassStock;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }
}
