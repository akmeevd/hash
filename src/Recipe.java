import java.util.*;

public class Recipe {
    private Set<Product> products = new HashSet<>();
    private Integer sum;
    private String name;
    private Set<Recipe> recipes = new HashSet<>();

    public Recipe(String name, Product... products) {
        Integer sum = 0;
        for (int i = 0; i < products.length; i++) {
            this.products.add(products[i]);
            sum = sum + products[i].getCost();
        }
        this.name = name;
        this.sum = sum;


    }

    public void addRecipe() {
        int size = recipes.size();
        recipes.add(this);
        if (size == recipes.size()) {
            throw new RuntimeException("Данный рецепт уже есть");
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public Integer getSum() {
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(products, recipe.products) && Objects.equals(sum, recipe.sum) && Objects.equals(name, recipe.name) && Objects.equals(recipes, recipe.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, sum, name, recipes);
    }

        @Override
    public String toString() {
        return "Recipe{" +
                "products=" + products +
                ", sum=" + sum +
                ", name='" + name + '\'' +
                '}';
    }

}


