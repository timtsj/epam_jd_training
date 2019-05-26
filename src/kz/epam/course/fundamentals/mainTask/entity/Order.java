package kz.epam.course.fundamentals.mainTask.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final int MAX_QUANTITY = 10;
    private static final int MIN_QUANTITY = 0;
    private static final int MIN_PIZZA_NAME_LENGTH = 4;
    private static final int MAX_PIZZA_NAME_LENGTH = 20;
    private static final int MAX_INGREDIENTS = 7;
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

    public void newPizza(String pizzaName, String pizzaType, int quantity) {
        pizNum++;

        if (pizzaName.trim().length() < MIN_PIZZA_NAME_LENGTH || pizzaName.trim().length() > MAX_PIZZA_NAME_LENGTH) {
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
        if (ingredientList.size() > MAX_INGREDIENTS) throw new Exception("Pizza is full");
        pizza.setIngredients(ingredientList);
    }

    public void build() throws Exception {

        currentPizzaList.add(new Pizza(pizza.getPizzaName(), pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity()));

        int sum = 0;
        for (Pizza piz : getCurrentPizzaList()){
            sum += piz.getQuantity();
        }

        if (sum > MAX_QUANTITY) throw new Exception("Quantity can not be more than 10");
        if (sum < MIN_QUANTITY) throw new Exception("Quantity can not be less than 0");
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
