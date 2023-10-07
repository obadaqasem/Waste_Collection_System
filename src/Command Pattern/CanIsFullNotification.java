public class CanIsFullNotification implements Command{
    Trashbin trashbin; //defining attributes for the command for functionality
    //defining attributes for the command for functionality
    CollectionDepartmentEmployee collectionDepartmentEmployee;
   //making const
    public CanIsFullNotification(Trashbin trashbin,CollectionDepartmentEmployee collectionDepartmentEmployee) {
        this.trashbin = trashbin;
        this.collectionDepartmentEmployee=collectionDepartmentEmployee;
    }

    @Override
    //Execute method to make the sensor send the employee the full trashbins
    public void execute() {
        if(Trashbin.fullTrashBinCounter<5) {//just adding to the array

            CollectionDepartmentEmployee.trashbinsByOrder.add(trashbin);
        }
        else if(Trashbin.fullTrashBinCounter>=5) {// when it is off-limit it will start executing the simulation

            CollectionDepartmentEmployee.trashbinsByOrder.add(trashbin);
            collectionDepartmentEmployee.organize();
        }
    }
}
