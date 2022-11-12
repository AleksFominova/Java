

/**
 * Java.HW #3
 *
 * @author Aleksandra
 *
 * @version 07.11 - 11.11
 */

        abstract public class Animal implements IAnimal {
    protected String type;
    protected int runLimit;
    protected int swimLimit;

    Cat cat = new Cat(200);
    Dog dog = new Dog(500, 10);

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.run(500);
            animal.run(200);
            animal.swim(8);
            animal.swim(12);
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(type + "Can swim" + distance + "m.");
        } else {
            System.out.println(type + "Cannot swim" + distance + "m.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println("Can swim" + distance + "m.");
        } else {
            System.out.println("Cannot swim" + distance + "m.");
        }
    }
}




