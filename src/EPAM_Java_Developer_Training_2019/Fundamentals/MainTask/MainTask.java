package EPAM_Java_Developer_Training_2019.Fundamentals.MainTask;

import java.util.Scanner;

public class MainTask {

    public static void main(String[] args) throws Exception {
        client1();
        client2();
    }

    private static void client1() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to 'Palmetto' pizza.\nEnter you name: ");
        String clientName = scanner.nextLine();

        Order order = new Order(clientName, 7717);
        //System.out.println("Enter pizza name: ");
        order.newPizza("Margarita", "Calzone", 2);
        //order.getPizzaAttribute();
        order.addIngredient("Tomato Paste");
        order.addIngredient("Pepperoni");
        order.addIngredient("Garlic");
        order.addIngredient("Bacon");
        order.build();

        //System.out.println("Enter pizza name: ");
        order.newPizza("PepperoniOro", "Base pizza", 3);
        //order.getPizzaAttribute();
        order.addIngredient("Tomato Paste");
        order.addIngredient("Cheese");
        order.addIngredient("Pepperoni");
        order.addIngredient("Olives");
        order.build();

        System.out.println(order.toString());
    }

    private static void client2() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to 'Palmetto' pizza.\nEnter you name: ");
        String clientName = scanner.nextLine();

        Order order2 = new Order(clientName, 4372);
        //System.out.println("Enter pizza name: ");
        order2.newPizza("BasePZZ", "Base pizza", 12);
        //order.getPizzaAttribute();
        order2.addIngredient("Tomato Paste");
        order2.addIngredient("Pepperoni");
        order2.addIngredient("Garlic");
        order2.addIngredient("Bacon");
        order2.build();

        System.out.println(order2.toString());
    }
}

