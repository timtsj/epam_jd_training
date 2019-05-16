package kz.epam.course.fundamentals.mainTask.entity;

public enum Ingredients {

    TOMATO_PASTE("Tomato Paste", 1.0f),
    CHEESE("Cheese", 1.0f),
    SALAMI("Salami", 1.5f),
    BACON("Bacon", 1.2f),
    GARLIC("Garlic", 0.3f),
    CORN("Corn", 0.7f),
    PEPPERONI("Pepperoni", 0.6f),
    OLIVES("Olives", 0.5f),
    STANDARD("Standard pizza", 1.0f),
    CALZONE("Calzone", 1.5f);

    private String name;
    private float price;

    Ingredients(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
