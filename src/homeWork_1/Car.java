package homeWork_1;

/**
 * Created by Sherlock on 31.03.2017.
 */
public class Car {
    private String model;
    private Engine engine;
    private Wheel[] wheels;
    private double fuelVolumeInTank;
    private double fuel;
    private int wheelsDiameters;
    private double capacity;
    private double fuelConsumption;

    public Car(String model, Engine engine, Wheel[] wheels, double fuel, int wheelsDiameters) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = fuel;
        this.wheelsDiameters = wheelsDiameters;


    }

    public double getFuelVolumeInTank() {
        return fuelVolumeInTank;
    }

    public int getWheelsDiameters() {
        return wheelsDiameters;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void showModel() {
        System.out.println(model);
    }


    public String toString() {
        return String.format("Car model: %s,\n engine %s, ",
                model, engine.toString());
    }

    public double refurl(double fuelVolume) {
        if (fuel > getFuelVolumeInTank()) {
            System.out.printf("Бак переповнений!", (fuel - getFuelVolumeInTank()));
            fuel = getFuelVolumeInTank();
        } else {
            System.out.printf("заправлено - ", fuelVolume);
        }
        return fuel;
    }

    public double start(double distance) {

        if (fuel > distance * fuelConsumption / 100) {
            System.out.printf("Бензину хватить", distance);
            fuel -= distance * fuelConsumption / 100;
        } else {
            distance = fuel * 100 / fuelConsumption;
            System.out.println("Їдь на заправку!");
        }
        return distance;
    }


    public Wheel[] replaceWheel(Wheel newWheel, int position) {
        Wheel[] wheels = getWheels();

        if (wheelsDiameters == newWheel.getWheelDiameters()) {
            wheels[position] = newWheel;
            System.out.printf("Колессо замінено", position);
        } else {
            System.out.printf("Не співпадає з діаметром", position);
        }
        return wheels;
    }
}