public abstract class Landfill {
    abstract void init();
    public void launch(){
        init();
    }
    String type;


    int capacity;

    abstract void addToLandFill(Trash trash);
//I changed the type to boolean due to commands interactions

}
