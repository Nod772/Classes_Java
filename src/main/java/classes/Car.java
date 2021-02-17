package classes;

public class Car {
    private String name;
    private String makerName;
    private int yearOfPublish;
    private int engineVolume;


    public Car(String name, String makerName, int yearOfPublish, int engineVolume) {
        this.name = name;
        this.makerName = makerName;
        this.yearOfPublish = yearOfPublish;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", makerName='" + makerName + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
}
