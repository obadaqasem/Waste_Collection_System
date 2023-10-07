import java.util.ArrayList;
import java.util.*;
public class CollectionDepartmentEmployee {
  static ArrayList<Trashbin> trashbinsByOrder=new ArrayList<>(); //to add some of the trashbins before the execution
TruckDriver truckDriver=new TruckDriver(); // every CollectionDepartment should have a driver




Landfill[] landfills; //to get the data of the landfills to provide it for the driver through DriveTheTrashCommand
//making constructor
    public CollectionDepartmentEmployee(Landfill[] landfills) {
this.landfills=landfills;
    }

    ArrayList<CollectTheTrashCommand> collectTheTrashCommands=new ArrayList<>();
    void addToList(CollectTheTrashCommand command){
        collectTheTrashCommands.add(command);
    } //filling in the command array

    public ArrayList<CollectTheTrashCommand> getCollectTheTrashCommands() {
        return collectTheTrashCommands;
    }
//getter




    // I made the relationship between the truckdriver and the employee through this method the employee is the receiver and the TruckDriver is the invoker
     public void  organize(){
Scanner input=new Scanner(System.in);
        if(Trashbin.fullTrashBinCounter>=5){
            System.out.println("Now We Have "+Trashbin.fullTrashBinCounter+ " Trashbins full");
            System.out.println("We Need To Make The Collection Department Employee send some orders to the truck driver");

            System.out.println("Press Any Key to make the order");
            String a=input.nextLine();
            System.out.println("Order: Now We Need To Collect All The Full Trashbins");
            for (Trashbin trashbin1:trashbinsByOrder
                 ) {

                CollectTheTrashCommand command=new CollectTheTrashCommand(truckDriver,trashbin1);
                collectTheTrashCommands.add(command);


            }
            truckDriver.setCommands( collectTheTrashCommands);

            truckDriver.collectTheTrashes();
            while(truckDriver.isCollected==false);
            System.out.println("Now Press Any Key To Deliver The Trash And See The Logs");
            a=input.nextLine();
            ArrayList<DeliverTheTrashCommand> arrayList=new ArrayList<>(); //matching up the trash with the landfills with the same type through the deliver command
            for (Trash trash:truckDriver.trashes
                 ) {

                for (Landfill landfill:landfills
                     ) {

                    if(trash.getType().equals(landfill.type)){

                        arrayList.add(new DeliverTheTrashCommand(trash,landfill));
                    break;
                    }



                }
            }
            truckDriver.setDeliverTheTrashCommands(arrayList);

            truckDriver.deliverTheTrash();
            while (truckDriver.isDelivered==false);

                System.out.println("All The Trashes are dropped successfully at the landfill");






        }
    }
}
