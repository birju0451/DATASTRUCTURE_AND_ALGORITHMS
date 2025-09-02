package Module2_Real_Time_Problem;

import java.util.*;

class Order {
    int orderId;
    String foodItem;
    int prepTime;      // in minutes
    int expectedTime;  // expected delivery time in minutes
    int actualTime;    // actual delivery time in minutes

    Order(int orderId, String foodItem, int prepTime, int expectedTime, int actualTime) {
        this.orderId = orderId;
        this.foodItem = foodItem;
        this.prepTime = prepTime;
        this.expectedTime = expectedTime;
        this.actualTime = actualTime;
    }

    public boolean isDelayed() {
        return actualTime > expectedTime;
    }

    public void printStatus() {
        System.out.println("Order #" + orderId + " (" + foodItem + ")");
        if (isDelayed()) {
            System.out.println(" Delayed by " + (actualTime - expectedTime) + " minutes.");
        } else {
            System.out.println(" Delivered on time.");
        }
        System.out.println("-------------------------");
    }
}
public class RestaurantDelivery {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        // Sample real-time data
        orders.add(new Order(101, "Pizza", 20, 30, 35));  // delayed
        orders.add(new Order(102, "Burger", 10, 20, 18)); // on time
        orders.add(new Order(103, "Pasta", 25, 40, 50));  // delayed
        orders.add(new Order(104, "Sandwich", 5, 15, 15)); // on time

        System.out.println(" Restaurant Order Delivery Status:");
        System.out.println("====================================");

        for (Order o : orders) {
            o.printStatus();
        }
    }
}
