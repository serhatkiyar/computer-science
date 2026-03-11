package lab4;

public class Main {
    public static void main(String[] args) {
        Drink kahve = new Drink("Cofee", 200, "Medium");
        Drink limonata = new Drink("limonata", 200, "Large");
        Drink kola = new Drink("kola", 200, "Small");

        Food elma = new Food("Elma", 20, false);
        Food cips = new Food("cips", 20, true);
        Food doner = new Food("Doner", true);


        MenuItem dizi[] = new MenuItem[6];
        dizi[0] = kahve;
        dizi[1] = limonata;
        dizi[2] = kola;

        dizi[3] = elma;
        dizi[4] = cips;
        dizi[5] = doner;

        for (int i = 0; i < 6; i++) {
            dizi[i].displayDetails();
        }



    }
}
