public class Sensor extends Observer{
    Trashbin trashbin;
    NotificationSender notificationSender;
    public Sensor(CollectionDepartmentEmployee reciever,Trashbin trashbin,NotificationSender notificationSender) {
        this.trashbin=trashbin;
        this.trashbin.attach(this);
        this.reciever = reciever;
        this.notificationSender=notificationSender;
    }

    CollectionDepartmentEmployee reciever; // we need to specify the notification destination
    boolean isFull=false;
    boolean sent=false; //to check whether it is been sent before or not


    @Override
    public void update() { // to check whether it is full or not and to send the notification to the employee
        if(isFull==true && sent==false) {
            CanIsFullNotification canIsFullNotification = new CanIsFullNotification(trashbin,reciever);
            notificationSender.canIsFullNotification=canIsFullNotification;
            notificationSender.send();
            sent=true;
        }


    }
}
