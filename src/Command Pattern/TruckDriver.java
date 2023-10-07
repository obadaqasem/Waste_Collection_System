import java.util.ArrayList;

public class TruckDriver {
    public TruckDriver(ArrayList<CollectTheTrashCommand> commands) {
        this.commands =  commands;
    }

    // I changed the trashbins array into commands array
    //I added boolean is collected the we know if he got the trash or no
    //I added boolean is delivered that we know if he delieverd the trash to the landfill
    ArrayList<Trash> trashes=new ArrayList<>();
    boolean isCollected=false;
    boolean isDelivered=false;

    public void setDeliverTheTrashCommands(ArrayList<DeliverTheTrashCommand> deliverTheTrashCommands) {
        this.deliverTheTrashCommands = deliverTheTrashCommands;
    }

    private ArrayList<CollectTheTrashCommand> commands;
  private  ArrayList<DeliverTheTrashCommand> deliverTheTrashCommands;
    ArrayList<Trashbin> CollectedTrashbins;
 //I chanegd the CollectedTrashBins Array so that when we recall the collectTheTrashesMethod it will be re-intiallized;
    // I removed the notCollectedTrashbins array because we have commands array;

    public TruckDriver() {
    }

    public void setCommands(ArrayList<CollectTheTrashCommand> commands) {
        this.commands = commands;
    }

    public ArrayList<CollectTheTrashCommand> getCommands() {
        return commands;
    }

    public void collectTheTrashes(){

        CollectedTrashbins=new ArrayList<>();
        for (CollectTheTrashCommand command:commands
             ) {

            CollectedTrashbins.add(command.getTrashbin());
            command.execute();

            System.out.println("The Truck driver is collecting this trashbin :"+command.getTrashbin().location);
            System.out.println("The Truck driver collected The trash from trashbin: "+command.getTrashbin().location);
            System.out.println("Remaining Full Trashbins: "+Trashbin.fullTrashBinCounter );
        }
        System.out.println("All The Trashes has been collected");
        commands=new ArrayList<>();
        isCollected=true;


    }
    //modifiying deliverTheTrash
    public void deliverTheTrash(){//executing the commands
        System.out.println("The Truck driver is delivering this trash");
        System.out.println("***************************************************************");

        for (DeliverTheTrashCommand command :deliverTheTrashCommands
                ) {
            command.execute();




        }
        System.out.println("***************************************************************");
        deliverTheTrashCommands=new ArrayList<>();
        if(deliverTheTrashCommands.size()==0)
            isDelivered=true;
        else{
            isDelivered=false;
        }
    }

}
