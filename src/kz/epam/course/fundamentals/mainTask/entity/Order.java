package kz.epam.course.fundamentals.mainTask.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Pizza pizza;
    private Client client;

    private int orderNumber = 10000;
    private int pizNum;

    private List<String> ingredientList;

    private List<Pizza> currentPizzaList = new ArrayList<>();

    public Order(String clientName, int clientNumber) {
        client = new Client(clientName, clientNumber);
        pizza = new Pizza();
        this.orderNumber++;
    }

    public void newPizza(String pizzaName, String pizzaType, int quantity) throws Exception {
        if (quantity > 10) throw new Exception("Quantity can not be more than 10");
        if (quantity < 0) throw new Exception("Quantity can not be less than 0");
        pizNum++;

        if (pizzaName.trim().length() < 4 || pizzaName.trim().length() > 20) {
            pizza.setPizzaName(client.getName() + "_" + pizNum);
        } else {
            pizza.setPizzaName(pizzaName);
        }

        pizza.setPizzaType(pizzaType);
        pizza.setQuantity(quantity);
        ingredientList = new ArrayList<>();
    }

    public void getPizzaAttribute() {
        String orderString = orderNumber + ":" + client.getId() + ":" + pizza.getPizzaName() + ":" + pizza.getQuantity();
        System.out.println(orderString);
    }

    public void addIngredient(String ingredient) throws Exception {

        for (String s : ingredientList) {
            if (s.equals(ingredient)) {
                throw new IllegalArgumentException("Check ingredient again");
            }
        }

        ingredientList.add(ingredient);
        if (ingredientList.size() > 8) throw new Exception("Pizza is full");
        pizza.setIngredient(ingredientList);
    }

    public void build() {
        currentPizzaList.add(new Pizza(pizza.getPizzaName(), pizza.getPizzaType(), pizza.getIngredient(), pizza.getQuantity()));
    }

    public Client getClient() {
        return client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Pizza> getCurrentPizzaList() {
        return currentPizzaList;
    }
}
