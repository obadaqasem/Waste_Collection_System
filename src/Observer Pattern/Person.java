public class Person {

//neutral element
// the person adds the trash

    public void addToTrashBin(Trash trash,Trashbin trashbin){
        if(trashbin.measurement+1==80){
            trashbin.sensor.isFull=true;
            ++Trashbin.fullTrashBinCounter;
        }
        trashbin.measurement++;
        trashbin.addToTrashBin(trash);


    }


}
