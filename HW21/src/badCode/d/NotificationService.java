package badCode.d;

class NotificationService {
    private Notify notifier;

    NotificationService(Notify notifier) {
        this.notifier = notifier;
    }

    void sendNotification(String recipient, String message, String deliveryMethod) {
            notifier.sendNotify(recipient, message);
    }
}
