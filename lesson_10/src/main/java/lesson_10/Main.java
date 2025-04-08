package lesson_10;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        orangeBox.addFruit(new Orange());

        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        System.out.println("Are the boxes equal in weight? " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.transferTo(newAppleBox);
        System.out.println("New Apple box weight after transfer: " + newAppleBox.getWeight());

        appleBox.swap(0, 1);
    }
}