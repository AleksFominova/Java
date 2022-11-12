public class Cat extends Animal {


    public Cat(int runLimit) {
        super(runLimit, 0);
        this.type = "Cat";

    }
    @Override
    public void swim(int distance){
        System.out.println("Cat cannot swim.");
    }




}


