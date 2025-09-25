package design_patterns.exemplo_adapter;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        SmsService smsService = new SmsService();
        SmsServiceAdapter adapter = new SmsServiceAdapter(smsService);

        System.out.println(notifyUser(notifier, "Bem vindo ao sistema"));
        System.out.println(notifyUser(adapter, "Seu código é 1234"));
    }

    private static String notifyUser(Notifier notifier, String message) {
        return notifier.send(message);
    }
}
