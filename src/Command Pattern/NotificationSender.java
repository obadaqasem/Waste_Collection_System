public class NotificationSender {
    CanIsFullNotification canIsFullNotification;

    public NotificationSender() {
        this.canIsFullNotification = canIsFullNotification;
    }
    public void send(){
        canIsFullNotification.execute();
    }
}
