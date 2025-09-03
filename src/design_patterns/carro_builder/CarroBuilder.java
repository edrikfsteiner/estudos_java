package design_patterns.carro_builder;

public class CarroBuilder {
    protected String brand;
    protected String model;
    protected String year;
    protected String engine;
    protected String color;
    protected String gps;

    public CarroBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarroBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarroBuilder year(String year) {
        this.year = year;
        return this;
    }

    public CarroBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarroBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarroBuilder gps(String gps) {
        this.gps = gps;
        return this;
    }

    public Carro build() {
        return new Carro(this);
    }
}