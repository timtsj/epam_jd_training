package EPAM_Java_Developer_Training_2019.Fundamentals.MainTask;

import java.util.*;

class Order {
    private int orderNumber = 10000;
    private int clientNumber;
    private String pizzaName;
    private String clientName;
    private String pizzaType;
    private int count;
    private int pizNum;

    private Map<String, Float> typeMap = new HashMap<>();
    private Map<Integer, String> order = new HashMap<>();
    private List<String> ingredientList;

    private List<Pizza> currentPizzaList = new ArrayList<>();

    public Order(String clientName, int clientNumber) {
        if (clientNumber == 0) {
            this.clientNumber++;
        }
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.orderNumber++;

        typeMap.put("Calzone", 1.5f);
        typeMap.put("Base pizza", 1.0f);
        typeMap.put("Tomato Paste", 1.0f);
        typeMap.put("Cheese", 1.0f);
        typeMap.put("Salami", 1.5f);
        typeMap.put("Bacon", 1.2f);
        typeMap.put("Garlic", 0.3f);
        typeMap.put("Corn", 0.7f);
        typeMap.put("Pepperoni", 0.6f);
        typeMap.put("Olives", 0.5f);

        Date date = new Date();
    }

    public void newPizza(String pizzaName, String pizzaType, int quantity) throws Exception {
        if (quantity > 10) throw new Exception("Quantity can not be more than 10");
        if (quantity < 0) throw new Exception("Quantity can not be less than 0");
        pizNum++;

        if (pizzaName.trim().length() < 4 || pizzaName.trim().length() > 20) {
            this.pizzaName = clientName + "_" + pizNum;
        } else {
            this.pizzaName = pizzaName;
        }

        this.pizzaType = pizzaType;
        this.count = quantity;
        ingredientList = new ArrayList<>();
    }

    public void getPizzaAttribute() {
        String orderString = orderNumber + ":" + clientNumber + ":" + pizzaName + ":" + count;
        System.out.println(orderString);
    }

    void addIngredient(String ingredient) throws Exception {

        for (String s : ingredientList) {
            if (s.equals(ingredient)) {
                throw new IllegalArgumentException("Check ingredient again");
            }
        }

        ingredientList.add(ingredient);
        if (ingredientList.size() > 8) throw new Exception("Pizza is full");
    }

    public void build() {
        currentPizzaList.add(new Pizza(pizzaName, pizzaType, ingredientList, count));
    }

    public String toString() {
        String star = new String(new char[25]).replace("\0", "*");
        String hyphen = new String(new char[25]).replace("\0", "-");
        String format = "%-15s %6.2f €%n";
        float totalSum = 0;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(star).append("\n");
        stringBuilder.append("Заказ: ").append(orderNumber).append("\n");
        stringBuilder.append("Клиент: ").append(clientNumber).append("\n");

        for (Pizza pizza : currentPizzaList) {
            float sum = typeMap.get(pizza.getPizzaType());

            stringBuilder.append("Название: ").append(pizza.getPizzaName()).append("\n");
            stringBuilder.append(hyphen).append("\n");
            stringBuilder.append(String.format(format, pizza.getPizzaType(), typeMap.get(pizza.getPizzaType())));

            for (String s : pizza.getIngredient()) {
                stringBuilder.append(String.format(format, s, typeMap.get(s)));
                sum += typeMap.get(s);
            }
            stringBuilder.append(hyphen).append("\n");
            stringBuilder.append(String.format(format, "Всего: ", sum));
            stringBuilder.append(String.format("%-15s %8d%n", "Кол-во: ", pizza.getCount()));
            stringBuilder.append(hyphen).append("\n");

            totalSum += sum * pizza.getCount();
        }
        stringBuilder.append(String.format(format, "Общая сумма: ", totalSum));
        stringBuilder.append(star).append("\n");

        return stringBuilder.toString();
    }
}
