package race;

public class Bus extends Transport {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving(){
        System.out.println("Посадить пассажиров");
        System.out.println("Начать движение");
    };

    public void stopMoving(){
        System.out.println("Завершить движение");
        System.out.println("Высадить пасажиров");
    };
}
