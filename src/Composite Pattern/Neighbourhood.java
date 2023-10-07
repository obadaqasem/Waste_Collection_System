import java.util.ArrayList;

public class Neighbourhood implements Component{
   private ArrayList<Street> streets=new ArrayList<>();


   public Neighbourhood(ArrayList<Street> streets) {
      this.streets = streets;
   }

   public Neighbourhood() {
   }

   @Override
   public void removeComponent(Component component) {

   }

   @Override
   public void addComponent(Component component) {
      streets.add((Street) component);
   }

   @Override
   public ArrayList<Trashbin> extract() {
      for (Component component:streets
      ) {

         component.extract();
      }
      return City.arrayList;

   }
}
