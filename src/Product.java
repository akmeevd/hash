import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private Integer cost;
    private Double weightInKg;


    public Product(String name, Integer cost, Double weightInKg) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (cost != null) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        if (weightInKg != null) {
            this.weightInKg = weightInKg;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(Double weightInKg) {
        this.weightInKg = weightInKg;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(cost, product.cost) && Objects.equals(weightInKg, product.weightInKg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weightInKg);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weightInKg=" + weightInKg +
                '}';
    }

}
