public class MedicalTrash extends Trash{
    //setting the type
    //extending the trash for filling issues
    public MedicalTrash() {
        launch();
    }

    @Override
    void init() {
        setType("Medical");
    }
}
