package design_patterns.carro_builder;

public class Carro {
    protected String brand;
    protected String model;
    protected String year;
    protected String engine;
    protected String color;
    protected String gps;

    public Carro(CarroBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.engine = builder.engine;
        this.color = builder.color;
        this.gps = builder.gps;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getGps() {
        return gps;
    }
}