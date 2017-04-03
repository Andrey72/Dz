package homeWork_1.dog;

/**
 * Created by Sherlock on 03.04.2017.
 */
public class Dog extends Animal {
    public Dog (String name , int age){
        super(name,age);
    }

    public void jump() {
        System.out.println("I'm jumping");
    }

    public void bite() {
        System.out.println("I'm biting");
    }

    public void run() {
        System.out.println("I'm runing");
    }

    public void voice() {
        System.out.println("Gav- Gav!");
    }
}
