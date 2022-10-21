import java.util.Objects;

public class Passport {
    private String number;
    private String surName;
    private String name;
    private String lastName;
    private String birth;


    public Passport(String number, String surName, String name, String lastName, String birth) {
        if (number.length() == 10 && number.matches("^[0-9]*$")) {
            if (number != null || !number.isBlank() || !number.isEmpty()) {
                this.number = number;
            }
        } else {
            throw new IllegalArgumentException("Неправильно набран номер паспорта. Номер паспорта должен содержать 10 цифр");
        }
        if (surName != null || !surName.isBlank() || !surName.isEmpty()) {
            this.surName = surName;
        }
        if (name != null || !name.isBlank() || !name.isEmpty()) {
            this.name = name;
        }
        this.lastName = lastName;
        if (birth.length() == 8 && birth.matches("^[0-9]*$")) {
            for (int i = 0; i < birth.length() + 2; i++) {
                if (i == 0) {
                    this.birth = "";
                }
                if (i == 2 || i == 4) {
                    this.birth = this.birth + ".";
                }
                if (i == birth.length()) {
                    break;
                }
                this.birth = this.birth + birth.substring(i, i + 1);
            }
//            this.birth = birth;
        } else {
            throw new IllegalArgumentException("Некорректная дата рождения");
        }
    }


    public String getNumber() {
        return number;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirth() {
        return birth;
    }


    public void setSurName(String surName) {
        if (this.surName == null) {
            this.surName = surName;
        }
    }

    public void setName(String name) {
        if (this.name == null)
            this.name = name;
    }

    public void setLastName(String lastName) {
        if (this.lastName == null)
            this.lastName = lastName;
    }

    public void setBirth(String birth) {
        if (this.birth == null)
            this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(surName, passport.surName) && Objects.equals(name, passport.name) && Objects.equals(lastName, passport.lastName) && Objects.equals(birth, passport.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, surName, name, lastName, birth);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}
