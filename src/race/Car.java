package race;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving(){
        System.out.println("Прогреть двиготель - проехать 3 разогравочных круга");
        System.out.println("Стартовать по фигналу");
    };

    public void stopMoving(){
        System.out.println("пересечь черту ФИНИШ на последнем круге");
    };
}
