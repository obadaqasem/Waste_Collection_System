import java.util.ArrayList;

public class CollectTheTrashCommand implements Command {
    TruckDriver truckDriver;
//we need to add a command for each trashbin
    private Trashbin trashbin;

    public Trashbin getTrashbin() {
        return trashbin;
    }

    public CollectTheTrashCommand(TruckDriver truckDriver, Trashbin trashbin) {
        this.truckDriver = truckDriver;
        this.trashbin = trashbin;
    }

    @Override
    public void execute() { //making the measuring attributes zero for the trashbin
       trashbin.measurement=0;
        for (Trash trash: trashbin.trashes
             ) {
            truckDriver.trashes.add(trash); //filling in from the trashbin to the truck tank

        }

        trashbin.trashes=new ArrayList<>(); //decreasing the main counter
        Trashbin.fullTrashBinCounter--;


    }
}
