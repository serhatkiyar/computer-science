    package lab5;

    public class Carnivore extends Animal{
        private int meatRequired;
        public Carnivore(String name, int age, boolean isFed, int meatRequired) {
            super(name, age, isFed);
            this.meatRequired = meatRequired;
        }



        @Override
        public void feedAnimal() {
            if (this.meatRequired > Animal.getMeatStock()) {
                System.out.printf("Yetersiz et stoğu! %s beslenemedi. ( Beklenen: [ %dg ], Mevcut: [ %dg ] )\n",this.getName(), this.meatRequired, Animal.getMeatStock());

            }
            else {
                System.out.printf("%s %dg et ile beslendi.\n", getName(), this.meatRequired);
                Animal.setMeatStock(Animal.getMeatStock() - this.meatRequired);
                this.setFed(true);
            }
        }


    }
