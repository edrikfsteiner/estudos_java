package design_patterns.exemplo_adapter;

public class Notifier {
    public Notifier() {}

    public String send(String message) {
        return "Notificação enviada: " + message;
    }
}