import java.util.*;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private Sponsor sponsor;
    private Mechanic mechanic;
    private Driver driver;

    private Set<Car> listOfRacingCars = new HashSet<>();

    public Car(String brand, String model, Double engineVolume, Sponsor sponsor, Mechanic mechanic, Driver driver) {
        this(brand, model, engineVolume);
        this.sponsor = sponsor;
        this.mechanic = mechanic;
        this.driver = driver;

    }

    public Car(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void addCar() {
        listOfRacingCars.add(this);
    }

    public void defineDriverAndSponsorAndMechanic() {
        System.out.println("Водитель " + driver.getFullName() + ". Спонсор " + sponsor.getName() + ". Механик " +
                mechanic.getFulName());
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public Set<Car> getListOfRacingCars() {
        return listOfRacingCars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(engineVolume, car.engineVolume) && Objects.equals(sponsor, car.sponsor) && Objects.equals(mechanic, car.mechanic) && Objects.equals(driver, car.driver) && Objects.equals(listOfRacingCars, car.listOfRacingCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, sponsor, mechanic, driver, listOfRacingCars);
    }
}
