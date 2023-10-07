public class GeneralTrash extends Trash{ //extending the trash for filling issues
    //setting the type
    public GeneralTrash() {
        launch();
    }

    @Override
    void init() {
        setType("General");
    }
}
