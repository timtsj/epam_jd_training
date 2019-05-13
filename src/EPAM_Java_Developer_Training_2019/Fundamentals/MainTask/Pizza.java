package EPAM_Java_Developer_Training_2019.Fundamentals.MainTask;

import java.util.List;

class Pizza {
    private String pizzaName;
    private String pizzaType;
    private List<String> ingredient;
    private int count;

    public Pizza(String pizzaName, String pizzaType, List<String> ingredient, int count) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.ingredient = ingredient;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
