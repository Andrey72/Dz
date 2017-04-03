package dog;

/**
 * Created by Sherlock on 03.04.2017.
 */
public class Animal {
    String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
