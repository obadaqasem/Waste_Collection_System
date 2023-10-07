import java.util.ArrayList;
//main interface  to define which is a container and which one is a base item
public interface Component {
     void removeComponent(Component component);
     void addComponent(Component component);
     ArrayList<Trashbin> extract();
}
