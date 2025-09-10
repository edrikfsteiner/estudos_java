package design_patterns.exemplo_singleton;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("db://meu-banco");
        Database db2 = Database.getInstance("db://meu-bamco");

        db1.query("SELECT * FROM users");
        db2.query("SELECT * FROM products");
    }
}
