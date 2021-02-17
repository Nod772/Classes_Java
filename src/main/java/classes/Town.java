package classes;

public class Town {
    private String name;
    private int countPeople;
    private double Square;

    public Town(String name) {
        this.name = name;
        this.countPeople = 0;
        this.Square = 0;
    }

    public Town(String name, int countPeople, double square) {
        this.name = name;
        this.countPeople = countPeople;
        Square = square;
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

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", countPeople=" + countPeople +
                ", Square=" + Square +
                '}';
    }

    public double getSquare() {
        return Square;
    }

    public void setSquare(double square) {
        Square = square;
    }
}
