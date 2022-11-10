
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

            Animal[] animals = {cat, dog};
            for(Animal animal : animals){
                animal.run();
            }
            public Animal() {

            }
            @Override
            public void run() {

            }



            @Override
            public String toString() {
                return "Animal{" +
                        "type='" + type + '\'' +
                        ", runLimit=" + runLimit +
                        ", swimLimit=" + swimLimit +
                        '}';
            }

            }




