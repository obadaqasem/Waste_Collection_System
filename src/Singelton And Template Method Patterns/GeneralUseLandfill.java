import java.util.ArrayList;

public class GeneralUseLandfill extends Landfill{
    ArrayList<GeneralTrash> generalTrashes=new ArrayList<>();

    @Override
    void addToLandFill(Trash trash) {
            generalTrashes.add((GeneralTrash) trash);
            capacity++;


    }
    // I modified the init so that it identifies the type

//making the private consts
    private GeneralUseLandfill() {
    }

    static int capacityRatio;


    static int counter=0;
    @Override
    void init() {
        type="General";
        capacityRatio=80;
    }

    public static GeneralUseLandfill getInstance() {
    GeneralUseLandfill. counter++;
     if(counter<=2){
         return new GeneralUseLandfill();
     }
     else{
         return null;
     }
    }
    

   
}
