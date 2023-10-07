import java.util.ArrayList;

public class MedicalLandfill extends Landfill{
    static int counter;

    ArrayList<MedicalTrash> medicalTrashes=new ArrayList<>();
    static int capacityRatio;

    //I modified the init part so it idtenifies the type
    @Override
    void init() {
        type="Medical";
        capacityRatio=20;
    }

    private MedicalLandfill() {
    }

    @Override
    void addToLandFill(Trash trash) {

            medicalTrashes.add((MedicalTrash) trash);
            capacity++;


        }



    public static MedicalLandfill getInstance() {

       counter++;
       if(counter==1){

           return new MedicalLandfill();
       }
       else{
           return null;
       }
    }


}
