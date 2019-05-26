package kz.epam.course.fundamentals.mainTask.main;

import kz.epam.course.fundamentals.mainTask.entity.Ingredient;
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
        order.newPizza("Margarita", Ingredient.CALZONE.name(), 9);
        order.addIngredient(Ingredient.TOMATO_PASTE.name());
        order.addIngredient(Ingredient.PEPPERONI.name());
        order.addIngredient(Ingredient.GARLIC.name());
        order.addIngredient(Ingredient.BACON.name());
        order.build();

        order.newPizza("PepperoniOro", Ingredient.STANDARD.name(), 3);
        order.addIngredient(Ingredient.BACON.name());
        order.addIngredient(Ingredient.CHEESE.name());
        order.addIngredient(Ingredient.PEPPERONI.name());
        order.addIngredient(Ingredient.OLIVES.name());
        order.build();

        System.out.println(new OrderReport().toString(order));
    }

    private static void client2() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to 'Palmetto' pizza.\nEnter you name: ");
        String clientName = scanner.nextLine();

        Order order2 = new Order(clientName, 4372);
        order2.newPizza("BasePZZ", Ingredient.STANDARD.name(), 9);
        order2.addIngredient(Ingredient.TOMATO_PASTE.name());
        order2.addIngredient(Ingredient.PEPPERONI.name());
        order2.addIngredient(Ingredient.GARLIC.name());
        order2.addIngredient(Ingredient.BACON.name());
        order2.build();

        System.out.println(new OrderReport().toString(order2));
    }
}

