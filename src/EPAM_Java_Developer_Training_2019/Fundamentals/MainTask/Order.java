package EPAM_Java_Developer_Training_2019.Fundamentals.MainTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Order {
    private int orderNumber = 10000;
    private int clientNumber;
    private String pizzaName;
    private String clientName;
    private String pizzaType;
    private int count;

    private Map<String, Float> typeMap = new HashMap<>();
    private Map<Integer, String> order = new HashMap<>();
    private List<String> ingredientList = new ArrayList<>();

    private List<Pizza> currentPizzaList = new ArrayList<>();
    //private List<List<String>> pizzaList = new ArrayList<>();
    //private List<List<List<String>>> withIng = new ArrayList<>();


    public Order(String clientName, int clientNumber) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
    }

    public void newPizza(String pizzaName, String pizzaType, int count) throws Exception {
        if (count > 10 || count < 0) throw new Exception("count more than 10 or less 0");

        this.orderNumber++;
        this.clientNumber++;
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

        if (pizzaName.trim().length() < 4 || pizzaName.trim().length() > 20) {
            this.pizzaName = clientName + "_" + orderNumber;
        } else {
            this.pizzaName = pizzaName;
        }

        this.pizzaType = pizzaType;
        this.count = count;

    }

    public void getPizzaAttribute() {
        String orderString = orderNumber + ":" + clientNumber + ":" + pizzaName + ":" + count;
        System.out.println(orderString);
    }

    void addIngredient(String ingredient) {

//        for (String s : ingredientList) {
//            if (s.equals(ingredient)) {
//                throw new IllegalArgumentException("Check ingredient again");
//            }
//
//        }

        ingredientList.add(ingredient);
    }

    public String toString() {
        String star = new String(new char[20]).replace("\0", "*");
        String hyphen = new String(new char[20]).replace("\0", "-");
        currentPizzaList.add(new Pizza(pizzaName, pizzaType, ingredientList, count));

        float balance = 0;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(star + "\n");
        stringBuilder.append("Заказ: " + orderNumber + "\n");
        stringBuilder.append("Клиент: " + clientNumber + "\n");
        //
        for (Pizza pizza : currentPizzaList) {
            float sum = typeMap.get(pizza.getPizzaType());

            stringBuilder.append("Название: " + pizza.getPizzaName() + "\n");
            stringBuilder.append(hyphen + "\n");
            stringBuilder.append(pizza.getPizzaType() + "      " + typeMap.get(pizza.getPizzaType()) + " €" + "\n");

            for (String s : pizza.getIngredient()) {
                stringBuilder.append(s + "      " + typeMap.get(s) + " €" + "\n");
                sum += typeMap.get(s);
            }
            stringBuilder.append(hyphen + "\n");
            stringBuilder.append("Всего: " + "      " + sum + " €" + "\n");
            stringBuilder.append("Кол-во: " + "         " + pizza.getCount() + "\n");
            stringBuilder.append(hyphen + "\n");

            balance += sum * pizza.getCount();
        }
        stringBuilder.append("Общая сумма: " + "         " + balance + " €" + "\n");
        stringBuilder.append(star + "\n");

        return stringBuilder.toString();
    }
}
