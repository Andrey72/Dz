package homeWork_1.dog;

/**
 * Created by Sherlock on 03.04.2017.
 */
public class Puppy extends Dog {

    public Puppy(String name, int age) {
        super(name, age);
    }

    public void printName() {
        System.out.println("My name is - " + super.name + " I'm " + super.getAge()+" years old\n" );
    }
}
