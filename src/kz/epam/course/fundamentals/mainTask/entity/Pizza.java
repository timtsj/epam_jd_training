package kz.epam.course.fundamentals.mainTask.entity;

import java.util.List;

public class Pizza {
    private String pizzaName;
    private String pizzaType;
    private List<String> ingredient;
    private int quantity;

    public Pizza() {
    }

    public Pizza(String pizzaName, String pizzaType, List<String> ingredient, int quantity) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
