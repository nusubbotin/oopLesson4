package race;

public class cargoCar extends Transport {
    public cargoCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving(){
        System.out.println("Загрузить груз на старте");
        System.out.println("Начать движение");
    };

    public void stopMoving(){
        System.out.println("Завершить движение");
        System.out.println("Разгрузить груз на финише");
    };
}
