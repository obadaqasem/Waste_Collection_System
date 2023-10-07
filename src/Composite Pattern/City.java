import java.util.ArrayList;

public class City implements Component {
   private ArrayList<Neighbourhood> neighbourhoods = new ArrayList<>();
   static ArrayList<Trashbin> arrayList=new ArrayList<>();
   WasteCollectionDepartment wasteCollectionDepartment;
 MedicalLandfill medicalLandfill;
   Landfill[] landfills;
//each city has multiple landfills and a wasteCollectionDepartment as attributes
   public void fillSingelton(){ // to fill the singelton pattern up and calling the methods
       wasteCollectionDepartment=WasteCollectionDepartment.getInstance();
       MedicalLandfill medicalLandfill=MedicalLandfill.getInstance();
       medicalLandfill.launch();
       GeneralUseLandfill generalUseLandfill=GeneralUseLandfill.getInstance();
       generalUseLandfill.launch();
       GeneralUseLandfill generalUseLandfill1=GeneralUseLandfill.getInstance();
       generalUseLandfill1.launch();
      landfills= new Landfill[]{medicalLandfill,generalUseLandfill,generalUseLandfill1};
   }
   private String name;
   private int population;

   public void setName(String name) {
      this.name = name;
   }

   public City() {

   }

   public void setPopulation(int population) {
      this.population = population;
   }

   public String getName() {
      return name;
   }

   public ArrayList<Neighbourhood> getNeighbourhoods() {
      return neighbourhoods;
   }

   public int getPopulation() {
      return population;
   }


   @Override
   public void removeComponent(Component component) {

   }

   @Override
   public void addComponent(Component component) {
      neighbourhoods.add((Neighbourhood) component);
   }

   @Override
   public ArrayList<Trashbin> extract() {

      for (Component component:neighbourhoods
           ) {

         component.extract();
      }
      return arrayList;

   }
}
