package lab5;

public class Main {
    public static void main(String[] args) {
        Carnivore lion = new Carnivore("Aslan", 7, false, 4000);
        Herbivore elephant = new Herbivore("Fil", 16, false, 2500);
        Herbivore rabbit = new Herbivore("Tavşan", 2, false, 4000);

        System.out.printf("Aslan ID: %s\n", lion.getAnimalID());
        System.out.printf("Fil ID: %s\n", elephant.getAnimalID());
        System.out.printf("Tavşan ID: %s\n", rabbit.getAnimalID());

        Animal.setMeatStock(10000);
        Animal.setGrassStock(8000);

        Animal.showStock();

        lion.feedAnimal();
        lion.feedAnimal();
        lion.feedAnimal();


        Animal.showStock();

        rabbit.feedAnimal();
        rabbit.feedAnimal();
        rabbit.feedAnimal();


        Animal.showStock();


    }
}
