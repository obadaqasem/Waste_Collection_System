import java.util.ArrayList;

public class Trashbin extends Subject implements Component {// it is the subject with the sensor
    Sensor sensor;
   static int fullTrashBinCounter=0; //to check how many Trashbins are full
    int measurement; //check the quantity
    String location;
    final int maxQuantity=100; //check the ability
    ArrayList<Trash> trashes=new ArrayList<>();
public void notification(){
  sensor.update();
} //to update the status


    public Trashbin( String location) {

        this.sensor = sensor;
        this.location = location;
    }

    @Override
    public void removeComponent(Component component) {

    }

    @Override
    public void addComponent(Component component) {
        System.out.println("We can not add it");
    }

    @Override
    public ArrayList<Trashbin> extract() {
        City.arrayList.add(this);
        return City.arrayList;
    }
    public void addToTrashBin(Trash trash){
    trashes.add(trash);
    notification();
    }

    @Override
    public void attach(Observer observer) {
        this.sensor= (Sensor) observer;
    } //attaching the sensor with the trashbin
}
