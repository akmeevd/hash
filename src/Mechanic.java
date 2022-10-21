import java.util.*;

public class Mechanic {
    private String fulName;
    private String company;

    private Set<Mechanic> mechanics = new HashSet<>();

    public Mechanic(String fulName, String company) {
        if (fulName != null || !fulName.isBlank() || !fulName.isEmpty()) {
            this.fulName = fulName;
        } else {
            throw new IllegalArgumentException("Укажите имя");
        }
        if (company != null || !company.isBlank() || !company.isEmpty()) {
            this.company = company;
        }
        else {
            throw new IllegalArgumentException("Укажите компанию");
        }

    }



    public String getFulName() {
        return fulName;
    }

    public String getCompany() {
        return company;
    }



    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fulName, mechanic.fulName) && Objects.equals(company, mechanic.company) && Objects.equals(mechanics, mechanic.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fulName, company, mechanics);
    }
}
