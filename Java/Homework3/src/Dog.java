public class Dog extends Animal {

    protected int runLimit;
    protected int swimLimit;


    public Dog(String type, int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.type = type;

    }

    public void Dog() {
        Dog dog = new Dog("dog", 500, 10);
        System.out.println("Cat"  + " meters/" + " /runLimit: " + " meters/" + " /swimLimit:");
    }
    @Override
    public void run() {
        super.run();
    }
}


