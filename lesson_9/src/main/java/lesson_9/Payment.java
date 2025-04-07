package lesson_9;

public class Payment {

    public class Purchase {
        private String item;
        private double price;

        public Purchase(String item, double price) {
            this.item = item;
            this.price = price;
        }

        public String getItem() {
            return item;
        }

        public double getPrice() {
            return price;
        }
    }

    public void createPurchase(String item, double price) {
        Purchase purchase = new Purchase(item, price);
        System.out.println("Purchased: " + purchase.getItem() + " for " + purchase.getPrice());
    }
}

