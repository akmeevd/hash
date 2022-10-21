import java.time.LocalDate;
import java.util.*;

public class Driver {
    public enum Category {B, C, D}

    private String fullName;
    private boolean isDriverLicense;
    private Integer drivingExperience;
    private Category category;
    private Set<Driver> drivers = new HashSet<>();


    public Driver(String fullName, boolean isDriverLicense, Integer startDriving, Category category) {
        this.fullName = fullName;
        this.isDriverLicense = isDriverLicense;
        if (this.isDriverLicense == true) {
            this.category = category;
        }
        if (this.category == null) {
            throw new RuntimeException("Категория не указана");
        }
        this.drivingExperience = LocalDate.now().getYear() - startDriving;
    }

    public void startMoving() {
        System.out.println(this.fullName + " начинает движение");
    }

    public void finishMoving() {
        System.out.println(this.fullName + " останавливается");
    }

    public void fuelAuto() {
        System.out.println(this.fullName + " заправил машину");
    }


    public void setFullName(String fullName) {
        if (this.fullName == null) {
            this.fullName = fullName;
        }
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public Integer getDrivingExperience() {
        return drivingExperience;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return isDriverLicense == driver.isDriverLicense && Objects.equals(fullName, driver.fullName) && Objects.equals(drivingExperience, driver.drivingExperience) && category == driver.category && Objects.equals(drivers, driver.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, isDriverLicense, drivingExperience, category, drivers);
    }
}
