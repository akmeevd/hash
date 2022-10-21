import java.util.*;

public class Recipe {
    private Set<Product> products = new HashSet<>();
    private Integer sum;
    private String name;

    public Recipe(String name, Product... products) {
        Integer sum = 0;
        for (int i = 0; i < products.length; i++) {
            this.products.add(products[i]);
            sum = sum + products[i].getCost();
        }
        this.name = name;
        this.sum = sum;


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
        return Objects.equals(products, recipe.products) && Objects.equals(sum, recipe.sum) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, sum, name);
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


