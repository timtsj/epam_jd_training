package EPAM_Java_Developer_Training_2019.Fundamentals.MainTask;

import java.util.*;

public class MainTask {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        welcome();
        String clientName = scanner.nextLine();

        Order order = new Order(clientName, 7717);
        System.out.println("Enter pizza name: ");
        order.newPizza(scanner.nextLine(), "Calzone", 2);
        //order.getPizzaAttribute();
        order.addIngredient("Tomato Paste");
        order.addIngredient("Pepperoni");
        order.addIngredient("Garlic");
        order.addIngredient("Bacon");
        order.build();

        System.out.println("Enter pizza name: ");
        order.newPizza(scanner.nextLine(), "Base pizza", 3);
        //order.getPizzaAttribute();
        order.addIngredient("Tomato Paste");
        order.addIngredient("Cheese");
        order.addIngredient("Pepperoni");
        order.addIngredient("Olives");
        order.build();

        System.out.println(order.toString());

        Order order2 = new Order(clientName, 7717);
        System.out.println("Enter pizza name: ");
        order2.newPizza(scanner.nextLine(), "Calzone", 2);
        //order.getPizzaAttribute();
        order2.addIngredient("Tomato Paste");
        order2.addIngredient("Pepperoni");
        order2.addIngredient("Garlic");
        order2.addIngredient("Bacon");
        order2.build();

        System.out.println("Enter pizza name: ");
        order2.newPizza(scanner.nextLine(), "Base pizza", 3);
        //order.getPizzaAttribute();
        order2.addIngredient("Tomato Paste");
        order2.addIngredient("Cheese");
        order2.addIngredient("Pepperoni");
        order2.addIngredient("Olives");
        order2.build();
        System.out.println(order2.toString());
    }

    private static void welcome() {
        System.out.println("Hello, welcome to 'Palmetto' pizza.\nEnter you name: ");
    }


}

