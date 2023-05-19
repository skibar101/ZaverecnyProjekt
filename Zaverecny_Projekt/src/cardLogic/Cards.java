package cardLogic;

/**
 * class that is used in arraylist in DeckOfCard class, only getters setters and constructor are here
 */

public class Cards {


    private  String filePath;
    private  int value;

    //region getters, setters and constructor

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getValue() {
        return value;
    }
    public Cards() {

    }

    public Cards(String filePath, int value) {
        this.filePath = filePath;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //endregion
}
