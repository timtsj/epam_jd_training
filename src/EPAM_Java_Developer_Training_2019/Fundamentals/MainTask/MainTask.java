package EPAM_Java_Developer_Training_2019.Fundamentals.MainTask;

import java.util.*;

public class MainTask {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        welcome();
        String clientName = scanner.nextLine();
        //System.out.println("Enter pizza name: ");
        //String pizzaName = scanner.nextLine();

        Order order = new Order(clientName, 7717);
        order.newPizza("Margarita", "Calzone", 2);
        //order.getPizzaAttribute();
        order.addIngredient("Tomato Paste");
        order.addIngredient("Pepperoni");
        order.addIngredient("Garlic");
        order.addIngredient("Bacon");
        order.build();

        order.newPizza("PepperoniOro", "Base pizza", 3);
        //order.getPizzaAttribute();
        order.addIngredient("Tomato Paste");
        order.addIngredient("Cheese");
        order.addIngredient("Pepperoni");
        order.addIngredient("Olives");
        order.build();

        System.out.println(order.toString());
    }

    private static void welcome() {
        System.out.println("Hello, welcome to 'Palmetto' pizza.\nEnter you name: ");
    }


}

