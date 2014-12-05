package levelp.mvc.model;

/**
 * Created by d.tyufanov on 08.11.2014.
 */
public class PersonalData {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String city;
    private String metroStation;
    private Sex sex;
    private String contryForImigration;
    private String phoneNumber;
    private String email;

    private Languages languages;

    public Languages getLanguages() {
        if (languages != null) {
            return languages;
        } else {
            return Languages.Other;
        }
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public String getFirstName() {
        if (firstName != null) {
            return firstName;
        } else {
            return "";
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        if (middleName != null) {
            return middleName;
        } else {
            return "";
        }
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        if (lastName != null) {
            return lastName;
        } else {
            return "";
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        if (city != null) {
            return city;
        } else {
            return "";
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMetroStation() {
        if (metroStation != null) {
            return metroStation;
        } else {
            return "";
        }
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getContryForImigration() {
        if (contryForImigration != null) {
            return contryForImigration;
        } else {
            return "";
        }
    }

    public void setContryForImigration(String contryForImigration) {
        this.contryForImigration = contryForImigration;
    }

    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return phoneNumber;
        } else {
            return "";
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        if (email != null) {
            return email;
        } else {
            return "";
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
