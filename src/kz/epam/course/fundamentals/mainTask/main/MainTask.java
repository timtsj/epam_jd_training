package kz.epam.course.fundamentals.mainTask.main;

import kz.epam.course.fundamentals.mainTask.entity.Ingredients;
import kz.epam.course.fundamentals.mainTask.entity.Order;
import kz.epam.course.fundamentals.mainTask.report.OrderReport;

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
        order.newPizza("Margarita", Ingredients.CALZONE.name(), 2);
        order.addIngredient(Ingredients.TOMATO_PASTE.name());
        order.addIngredient(Ingredients.PEPPERONI.name());
        order.addIngredient(Ingredients.GARLIC.name());
        order.addIngredient(Ingredients.BACON.name());
        order.build();

        order.newPizza("PepperoniOro", Ingredients.STANDARD.name(), 3);
        order.addIngredient(Ingredients.BACON.name());
        order.addIngredient(Ingredients.CHEESE.name());
        order.addIngredient(Ingredients.PEPPERONI.name());
        order.addIngredient(Ingredients.OLIVES.name());
        order.build();

        System.out.println(new OrderReport().toString(order));
    }

    private static void client2() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to 'Palmetto' pizza.\nEnter you name: ");
        String clientName = scanner.nextLine();

        Order order2 = new Order(clientName, 4372);
        order2.newPizza("BasePZZ", Ingredients.STANDARD.name(), 12);
        order2.addIngredient(Ingredients.TOMATO_PASTE.name());
        order2.addIngredient(Ingredients.PEPPERONI.name());
        order2.addIngredient(Ingredients.GARLIC.name());
        order2.addIngredient(Ingredients.BACON.name());
        order2.build();

        System.out.println(new OrderReport().toString(order2));
    }
}

