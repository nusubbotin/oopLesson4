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
        race[6] = new CargoCar("Самосвал", "Камаз", 6);
        race[7] = new CargoCar("Карго", "Хендай", 4);
        race[8] = new CargoCar("Карго престиж", "Дацун", 7);

        for (Transport transport : race) {
            System.out.println(transport);
        }

        for (Transport auto : race) {
            System.out.println();
            System.out.println("!Стартует машина из класса "+ auto.getClass() + ": ");
            if (auto.getClass().equals(Bus.class)){
                Bus bus = (Bus) auto;
                bus.pitStop();
                bus.bestCircleTime();
                bus.maximumSpeed();
            } else if (auto.getClass().equals(Car.class)) {
                Car cur = (Car) auto;
                cur.pitStop();
                cur.bestCircleTime();
                cur.maximumSpeed();
            } else if (auto.getClass().equals(CargoCar.class)) {
                CargoCar cargoCar = (CargoCar) auto;
                cargoCar.pitStop();
                cargoCar.bestCircleTime();
                cargoCar.maximumSpeed();
            }
        }
    }
}