public class DeliverTheTrashCommand implements Command {
//creating the delivering command after collecting it;
    Trash trash;
Landfill landfill;
//adding boolean is executed so that we know if it is collected or no
    boolean isExecuted=false;

    public DeliverTheTrashCommand(Trash trash, Landfill landfill) {
        this.trash = trash;
        this.landfill = landfill;
    }

    @Override
    public void execute() { // filling from the truck tank to the landfill
          landfill.addToLandFill(trash);
            System.out.println("The Trash: "+trash.getType()+" is dropped at " +landfill.type+ " Landfill successfully");
        }



    }

