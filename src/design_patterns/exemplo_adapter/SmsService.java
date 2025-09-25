package design_patterns.exemplo_adapter;

public class SmsService {
    public SmsService() {}

    public String send(String message) {
        return "SMS enviado: " + message;
    }
}
