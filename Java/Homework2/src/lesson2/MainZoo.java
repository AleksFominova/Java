/**
 * Java.HW #2
 *
 * @author Aleksandra
 *
 * @version 03.11 - 06.11
 */
package lesson2;

public class MainZoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 3);
        Dog dog = new Dog("Sharik","black", 5);

        Cat emptyCat = new Cat();

        cat.voice();
        dog.voice();
        System.out.println(cat);
        System.out.println(dog);

        System.out.println(add(2, 2));
        System.out.println(add(-5.3, 3.5));
        System.out.println(add("123", "456"));

    }

    static int add(int a, int b){
        return a+b;
    }
    static  double add(double a, double b){
        return a+b;
    }
    static  String add(String a, String b){
        return a+b;
    }
}
