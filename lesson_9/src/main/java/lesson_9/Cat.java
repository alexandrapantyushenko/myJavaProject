package lesson_9;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(name + " can't run that far.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim.");
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(int foodAmount) {
        if (foodAmount > 0) {
            this.isFull = true;
            System.out.println(name + " has eaten.");
        } else {
            System.out.println(name + " doesn't have enough food.");
        }
    }
}


