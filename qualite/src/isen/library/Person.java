package isen.library;

public class Person {
    public String name;
    public int years;

    // Constructeur par défaut
    public Person() {
        this.name = "unknown";
        this.years = 22;
    }

    // Getters et setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
