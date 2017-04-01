package homeWork_1;

/**
 * Created by Sherlock on 31.03.2017.
 */
public class Run {
    public static void main(String[] args) {
        Wheel wh1 = new Wheel(14);
        Wheel wh2 = new Wheel(14);
        Wheel wh3 = new Wheel(14);
        Wheel wh4 = new Wheel(14);

        Wheel[] wheels = new Wheel[4];
        wheels[0] = wh1;
        wheels[1] = wh2;
        wheels[2] = wh3;
        wheels[3] = wh4;


        Engine engine = new Engine(2.0);
        Car car = new Car("Seat Ibiza",  engine,wheels, 1, 14);

        car.showModel();
        car.start(120000.0);

        System.out.println();

        car.refurl(10.0);

        Wheel wh5 = new Wheel(14);
        Wheel wh6 = new Wheel(4);

        car.replaceWheel(wh5, 1);
        car.replaceWheel(wh6, 4);
    }
}
