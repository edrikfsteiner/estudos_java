package design_patterns.exemplo_adapter;

public class SmsServiceAdapter extends Notifier {
    public SmsServiceAdapter(final SmsService smsService) {}

    @Override
    public String send(String message) {
        return "Mensagem enviada: " + message;
    }
}
