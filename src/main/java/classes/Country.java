package classes;

import java.util.List;

public class Country {
    private String name;
    private int countPeople;
    private double Square;
    private int countRegion;
    private List<String> languages;

    public Country(String name, int countPeople, double square, int countRegion, List<String> languages) {
        this.name = name;
        this.countPeople = countPeople;
        Square = square;
        this.countRegion = countRegion;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public double getSquare() {
        return Square;
    }

    public void setSquare(double square) {
        Square = square;
    }

    public int getCountRegion() {
        return countRegion;
    }

    public void setCountRegion(int countRegion) {
        this.countRegion = countRegion;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", countPeople=" + countPeople +
                ", Square=" + Square +
                ", countRegion=" + countRegion +
                ", languages=" + languages +
                '}';
    }
}
