import java.util.ArrayList;
import java.util.*;
public class ScenarioLauncher {
    public static City cityObjCombiner(){
        // for scenario
        City city=new City();
        city.fillSingelton();
        CollectionDepartmentEmployee collectionDepartmentEmployee=city.wasteCollectionDepartment.getCollectionDepartmentEmployee(city.landfills);

       Trashbin trashbin=new Trashbin("A");
        Trashbin trashbin1=new Trashbin("B");
        Trashbin trashbin2=new Trashbin("C");
        Trashbin trashbin3=new Trashbin("D");
        Trashbin trashbin4=new Trashbin("E");
        NotificationSender notificationSender=new NotificationSender();
        NotificationSender notificationSender1=new NotificationSender();
        NotificationSender notificationSender2=new NotificationSender();
        NotificationSender notificationSender3=new NotificationSender();
        NotificationSender notificationSender4=new NotificationSender();
        Sensor sensor=new Sensor(collectionDepartmentEmployee,trashbin,notificationSender);
        Sensor sensor1=new Sensor(collectionDepartmentEmployee,trashbin1,notificationSender1);
        Sensor sensor2=new Sensor(collectionDepartmentEmployee,trashbin2,notificationSender2);
        Sensor sensor3=new Sensor(collectionDepartmentEmployee,trashbin3,notificationSender3);
        Sensor sensor4=new Sensor(collectionDepartmentEmployee,trashbin4,notificationSender4);
        Street street=new Street();
        street.addComponent(trashbin);
        street.addComponent(trashbin1);
        street.addComponent(trashbin2);
        street.addComponent(trashbin3);
        street.addComponent(trashbin4);
        Neighbourhood neighbourhood=new Neighbourhood();
        neighbourhood.addComponent(street);
        city.addComponent(neighbourhood);
        return city;
    }

    public static void main(String[] args) {

        City city=cityObjCombiner();
        ArrayList<Trashbin> trashbins= city.extract(); //to get the base items
        System.out.println("Now We Start With The Story");
        System.out.println("Now in One Of The Streets in Of The Neighbourhood, A Waste Management Scenario needed to be visualized");
        System.out.println("Let's Start By The Scenario");
        System.out.println("Now, We Should Wait Until The Neighbours Fill The Trashbins");
        System.out.println("Press Any Key to start the filling");
        Scanner input=new Scanner(System.in);
        String choice=input.nextLine();
        int counter=10;
        while (Trashbin.fullTrashBinCounter<5){
            Person person=new Person();
            for (Trashbin tr : trashbins
            ) {
                if (tr.measurement < tr.maxQuantity) {
                    if(counter%10==0){
                        person.addToTrashBin(new MedicalTrash(),tr);
                        counter++;
                        break;
                    }
                    else{
                        person.addToTrashBin(new GeneralTrash(),tr);
                        counter++;
                        break;
                    }
                }
            }

            }
        }

    }

