package classes;

public class Human {
    private String name;
    private double weight;
    private double height;
    private int years;

    public Human(String name, double weight, double height, int years) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.years = years;
    }

    public Human(String name) {
        this.name = name;
        this.years = 0;
        this.height = 50;
        this.weight = 4;
    }

    public Human(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.years = 0;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", years=" + years +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
