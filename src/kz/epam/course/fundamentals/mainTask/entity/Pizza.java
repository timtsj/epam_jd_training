package kz.epam.course.fundamentals.mainTask.entity;

import java.util.List;
import java.util.Objects;

public class Pizza {
    private String pizzaName;
    private String pizzaType;
    private List<String> ingredients;
    private int quantity;

    public Pizza() {
    }

    public Pizza(String pizzaName, String pizzaType, List<String> ingredients, int quantity) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
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

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
