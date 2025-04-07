package lesson_10;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                totalWeight += Apple.weight;
            } else if (fruit instanceof Orange) {
                totalWeight += Orange.weight;
            }
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void transferTo(Box<T> otherBox) {
        if (this != otherBox) {
            otherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }

    public void swap(int i, int j) {
        if (i >= 0 && i < fruits.size() && j >= 0 && j < fruits.size()) {
            T temp = fruits.get(i);
            fruits.set(i, fruits.get(j));
            fruits.set(j, temp);
        }
    }
}