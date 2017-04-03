package homeWork_1.car;

/**
 * Created by Sherlock on 31.03.2017.
 */
public class Engine {
    private double capacity;

    public Engine(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return String.format("capacity - %f", capacity);
    }

}
