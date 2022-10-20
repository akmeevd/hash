import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Дз1 задание 1
        Set<Product> products = new HashSet<>();
        Product banana = new Product("банан", 100, 0.5);
        Product chicken = new Product("куриное филе", 300, 1.0);
        Product chocolate = new Product("шоколад", 100, 0.1);
        Product coffee = new Product("кофе", 400, 0.2);
        Product iceCream = new Product("Мороженое", 300, 0.5);
        Product potato = new Product("Картофель", 30, 1.0);
        Product pepper = new Product("Перец", 1000, 1.0);
        Product salt = new Product("Соль", 200, 0.5);
        addProduct(products, banana);
        addProduct(products, chicken);
        //ДЗ 2 задание 1
        Set<Recipe> recipes = new HashSet<>();
        Recipe recipe1 = new Recipe("Мороженое с бананом и шоколадом", banana, chocolate, iceCream);
        Recipe recipe2 = new Recipe("Курица с каротшкой", chicken, potato, pepper, salt);
        Recipe recipe3 = new Recipe("Курица с каротшкой", chicken, potato, pepper, salt);
        addRecipe(recipes, recipe1);
        addRecipe(recipes, recipe2);
        System.out.println(recipes.toString());
        dz2task2();
        dz3task1();
        dz3task2();
        dz3task3();
        //Дз3 задание 4
        //HashSet, глупо наверное, но так как в Hashset не повторяются элементы по проход по все элементам пройдет быстрее.

    }
    public static void removeOdd(Set<Integer> numbers) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(numbers);
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 != 0) {
                numbers.remove(integers.get(i));
            }
        }
    }
    public static void addRecipe(Set<Recipe> recipes, Recipe recipe) {
        ArrayList<Recipe> recipes1 = new ArrayList<>();
        recipes1.addAll(recipes);
        for (int i = 0; i < recipes1.size(); i++) {
            if (recipes1.get(i).getName().equals(recipe.getName())) {
                throw new RuntimeException("Данный рецепт уже есть");
            }
        }
        recipes.add(recipe);

    }

    public static void savePassport(Set<Passport> passports, Passport passport1) {
        passports.add(passport1);
    }

    public static Passport findPassport(Set<Passport> passports, String number) {
        ArrayList<Passport> passports1 = new ArrayList<>();
        passports1.addAll(passports);
        for (int i = 0; i < passports1.size(); i++) {
            if (passports1.get(i).getNumber().equals(number)) {
                return passports1.get(i);
            }
        }
        return null;
    }

    public static void addProduct(Set<Product> products, Product product) {
        int size = products.size();
        products.add(product);
        if (size == products.size()) {
            throw new RuntimeException("Данный продукт уже есть");
        }
    }

    public static void addTask(Set<String> tasks, String task1) {
        ArrayList<String> tasks1 = new ArrayList<>();
        tasks1.addAll(tasks);
        int a = 0;

        for (int i = 0; i < tasks1.size(); i++) {
            if (!tasks1.get(i).substring(0, 1).equals(task1.substring(task1.length() - 1))
                    && !tasks1.get(i).substring(tasks1.size() - 1).equals(task1.substring(0, 1))) {
                a++;
            }
        }
        if (a == tasks1.size()) {
            tasks1.add(task1);
        }

        tasks.addAll(tasks1);



    }

    public static void dz3task3() {
        Set<Passport> passports = new HashSet<>();
        Passport passport1 = new Passport("0301010101", "Петров", "Петр", "Петрович", "01012000");
        Passport passport2 = new Passport("1301510101", "Иванов", "Иван", "Иванович", "02022002");
        Passport passport3 = new Passport("2341010101", "Степанов", "Степан", "Степанович", "11112011");
        Passport passport4 = new Passport("5701910101", "Ильин", "Илья", "Ильич", "21072001");
        Passport passport5 = new Passport("1301510101", "Иванов", "Иван", "Иванович", "02022002");
        savePassport(passports, passport1);
        savePassport(passports, passport2);
        savePassport(passports, passport3);
        savePassport(passports, passport4);
        savePassport(passports, passport5);
        System.out.println(findPassport(passports, "0301010101"));
        System.out.println(passports.toString());

    }
    public static void dz3task2() {
        Set<String> tasks = new HashSet<>();
        String task1 = "2 * 2";
        String task2 = "2 * 3";
        String task3 = "2 * 4";
        String task4 = "2 * 5";
        String task5 = "2 * 6";
        String task6 = "2 * 7";
        String task7 = "2 * 8";
        String task8 = "2 * 9";
        String task9 = "9 * 3";
        String task10 = "8 * 4";
        String task11 = "6 * 5";
        String task12 = "7 * 9";
        String task13 = "9 * 9";
        String task14 = "8 * 9";
        String task15 = "3 * 1";
        String task16 = "3 * 2";
        String task17 = "2 * 2";
        addTask(tasks, task1);
        addTask(tasks, task2);
        addTask(tasks, task3);
        addTask(tasks, task16);
        addTask(tasks, task17);

        System.out.println(Arrays.toString(tasks.toArray()));
    }

    public static void dz3task1() {
        Set<Sponsor> sponsors = new HashSet<>();
        Sponsor sponsor1 = new Sponsor("Red Bull", 3_000_000);
        Sponsor sponsor2 = new Sponsor("Lucoil", 2_000_000);

        Set<Driver> drivers = new HashSet<>();
        Driver driver1 = new Driver("alex", true, 2010, Driver.Category.B);
        Driver driver2 = new Driver("john", true, 2012, Driver.Category.C);

        Set<Mechanic> mechanics = new HashSet<>();
        Mechanic mechanic1 = new Mechanic("michael", "some");
        Mechanic mechanic2 = new Mechanic("phil", "some");

        Set<Car> cars = new HashSet<>();
        Car car1 = new Car("BMW", "X5", 3.0);
        Car car2 = new Car("BMW", "X4", 2.8);
    }

    public static void dz2task2() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(Arrays.toString(numbers.toArray()));
        removeOdd(numbers);
        System.out.println(Arrays.toString(numbers.toArray()));
    }

}










