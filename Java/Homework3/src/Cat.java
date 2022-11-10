public class Cat extends Animal {


    protected int runLimit;
    protected int swimLimit;

    public Cat(String type, int runLimit, int swimLimit) {
        super();
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.type = type;

    }

    public void Cat() {
        Cat cat = new Cat("cat", 200, 0);
        System.out.println("Cat"  + " meters/"  + " /runLimit: " + " meters/" + " /swimLimit:" );
    }

    @Override
    public void run() {
        super.run();
    }
}


