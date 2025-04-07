package lesson_9;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        Cat catMurka = new Cat("Murka");

        dogBobik.run(100);
        dogBobik.swim(5);
        catMurka.run(150);
        catMurka.swim(5);

        FoodBowl bowl = new FoodBowl(20);
        catMurka.eat(15);
        catMurka.eat(25);

        bowl.addFood(10);
        catMurka.eat(25);

        Payment payment = new Payment();
        payment.createPurchase("Toy", 10.5);

        Park park = new Park();
        park.createAttraction("Roller Coaster", "9:00 AM - 6:00 PM", 20.0);

        System.out.println("Total Animals: " + Animal.getAnimalCount());
        System.out.println("Total Dogs: " + Dog.getDogCount());
        System.out.println("Total Cats: " + Cat.getCatCount());
    }
}



