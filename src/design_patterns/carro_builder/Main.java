package design_patterns.carro_builder;

public class Main {
    public static void main(String[] args) {
        Carro toyotaCorolla = new CarroBuilder()
                .brand("Toyota")
                .model("Corolla")
                .year("2024")
                .engine("2.0")
                .color("Preto")
                .build();

        Carro hondaCivic = new CarroBuilder()
                .brand("Honda")
                .model("Civic")
                .year("2023")
                .engine("1.5 Turbo")
                .color("Prata")
                .build();

        System.out.println("Carro 1: " + toyotaCorolla.getBrand() + " " + toyotaCorolla.getModel() + " (" + toyotaCorolla.getYear() + ")");
        System.out.println("Motor: " + toyotaCorolla.getEngine() + ", Cor: " + toyotaCorolla.getColor() + ", GPS: " + toyotaCorolla.getGps());

        System.out.println("\n--------------------------\n");

        System.out.println("Carro 2: " + hondaCivic.getBrand() + " " + hondaCivic.getModel() + " (" + hondaCivic.getYear() + ")");
        System.out.println("Motor: " + hondaCivic.getEngine() + ", Cor: " + hondaCivic.getColor() + ", GPS: " + hondaCivic.getGps());
    }
}