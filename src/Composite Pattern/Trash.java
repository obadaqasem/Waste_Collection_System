public abstract class Trash {
    private String type;
    abstract void init();
    void launch(){
        init();
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
