import java.util.*;

public class Sponsor {
    private String name;
    private Integer sumOfSupport;

    public Sponsor(String name, Integer sumOfSupport) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Имя спонсора не задано");
        }
        if (sumOfSupport != null) {
            this.sumOfSupport = sumOfSupport;
        } else {
            throw new RuntimeException("Сумма поддержки не указана");
        }
    }

    public void sponsorRace(Car car) {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public Integer getSumOfSupport() {
        return sumOfSupport;
    }

    public void setSumOfSupport(Integer sumOfSupport) {
        this.sumOfSupport = sumOfSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name) && Objects.equals(sumOfSupport, sponsor.sumOfSupport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sumOfSupport);
    }
}
