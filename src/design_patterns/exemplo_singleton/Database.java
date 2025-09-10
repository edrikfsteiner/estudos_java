package design_patterns.exemplo_singleton;

public final class Database {
    private static volatile Database instance;
    private String connection;

    private Database(String connection) {
        this.connection = connection;
    }

    public static Database getInstance(String connection) {
        if (instance == null) {
            instance = new Database(connection);
        }
        return instance;
    }

    public void query(String sql) {
        System.out.printf("Executando query %s na conexão %s", sql, this.connection);
    }
}