package kz.epam.course.fundamentals.mainTask.report;

import kz.epam.course.fundamentals.mainTask.entity.Ingredient;
import kz.epam.course.fundamentals.mainTask.entity.Order;
import kz.epam.course.fundamentals.mainTask.entity.Pizza;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderReport {

    public String toString(Order order) {
        String star = new String(new char[25]).replace("\0", "*");
        String hyphen = new String(new char[25]).replace("\0", "-");
        String format = "%-15s %6.2f €%n";
        float totalSum = 0;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(star).append("\n");
        stringBuilder.append("Время: ").append(String.format("%17s", dateFormat.format(new Date()))).append("\n");
        stringBuilder.append("Заказ: ").append(order.getOrderNumber()).append("\n");
        stringBuilder.append("Клиент: ").append(order.getClient().getId()).append("\n");

        for (Pizza pizza : order.getCurrentPizzaList()) {
            float sum = Ingredient.valueOf(pizza.getPizzaType()).getPrice();

            stringBuilder.append("Название: ").append(pizza.getPizzaName()).append("\n");
            stringBuilder.append(hyphen).append("\n");
            stringBuilder.append(String.format(format, pizza.getPizzaType(), Ingredient.valueOf(pizza.getPizzaType()).getPrice()));

            for (String s : pizza.getIngredients()) {
                stringBuilder.append(String.format(format, s, Ingredient.valueOf(s).getPrice()));
                sum += Ingredient.valueOf(s).getPrice();
            }
            stringBuilder.append(hyphen).append("\n");
            stringBuilder.append(String.format(format, "Всего: ", sum));
            stringBuilder.append(String.format("%-15s %8d%n", "Кол-во: ", pizza.getQuantity()));
            stringBuilder.append(hyphen).append("\n");

            totalSum += sum * pizza.getQuantity();
        }
        stringBuilder.append(String.format(format, "Общая сумма: ", totalSum));
        stringBuilder.append(star).append("\n");

        return stringBuilder.toString();
    }
}
