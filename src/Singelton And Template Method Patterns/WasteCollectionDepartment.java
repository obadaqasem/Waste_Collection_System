import java.util.ArrayList;

public class WasteCollectionDepartment {
    static int objCounter=0;
     ArrayList<CollectionDepartmentEmployee> collectionDepartmentEmployees=new ArrayList<>();
    //we created this because the employee is working here


    public CollectionDepartmentEmployee getCollectionDepartmentEmployee(Landfill[] landfills) {
        CollectionDepartmentEmployee collectionDepartmentEmployee=new CollectionDepartmentEmployee(landfills);
    collectionDepartmentEmployees.add(collectionDepartmentEmployee);
        return collectionDepartmentEmployee;
    }

    private WasteCollectionDepartment() {
    }


    public static WasteCollectionDepartment getInstance() {
        WasteCollectionDepartment.objCounter++;
        if(WasteCollectionDepartment.objCounter==1){

            return new WasteCollectionDepartment();
        }
        else{
            return null;
        }
    }
}
