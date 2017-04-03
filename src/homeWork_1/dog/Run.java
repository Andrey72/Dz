package homeWork_1.dog;

/**
 * Created by Sherlock on 03.04.2017.
 */

/*2. Создать объект класса Щенок, используя классы Животное, Собака.
Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.*/
public class Run {
    public static void main(String[] args) {

        Puppy puppi = new Puppy("Rex" , 1);

        puppi.printName();
        puppi.jump();
        puppi.bite();
        puppi.run();
        puppi.voice();

    }
}

