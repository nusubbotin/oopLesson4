package race;

public class Main {
    public static void main(String[] args) {
        createRace();
    }

    private static void createRace() {
        Transport [] race = new Transport [9];
        race[0] = new Car("лада", "гранта", 1.5f);
        race[1] = new Car("Шевроле", "Ланос", 1.6f);
        race[2] = new Car("Лада", "Приора", 1.6f);
        //
        race[3] = new Bus("Скания", "Скания модель", 5.6f);
        race[4] = new Bus("Круиз", "Мерседес", 5);
        race[5] = new Bus("Савок", "Икарус", 4);
        //
        race[6] = new cargoCar("Самосвал", "Камаз", 6);
        race[7] = new cargoCar("Карго", "Хендай", 4);
        race[8] = new cargoCar("Карго престиж", "Дацун", 7);

        for (Transport transport : race) {
            System.out.println(transport);
        }
    }
}