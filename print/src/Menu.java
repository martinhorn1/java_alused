import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        this.meals.add(meal);
    }

    public void printMeals() {
        for (String s : this.meals) {
            System.out.println(s);
        }
    }

    public void clearMenu() {
        meals.clear();
        System.out.println("------------");
        System.out.println("Menu cleared");
        System.out.println("------------");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();
    }
}
