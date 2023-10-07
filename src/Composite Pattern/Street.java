import java.util.ArrayList;

public class Street implements Component {
   private ArrayList<Trashbin> trashbins=new ArrayList<>();

   private String name;



    public String getName() {
        return name;
    }

    public ArrayList<Trashbin> getTrashbins() {
        return trashbins;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void removeComponent(Component component) {

    }

    @Override
    public void addComponent(Component component) {
        trashbins.add((Trashbin) component);
    }

    @Override
    public ArrayList<Trashbin> extract() {
        for (Component component:trashbins
        ) {

            component.extract();
        }
        return City.arrayList;

    }
}
