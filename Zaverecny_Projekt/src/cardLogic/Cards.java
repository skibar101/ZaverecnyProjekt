package cardLogic;

import java.net.URL;

/**
 * class that is used in arraylist in DeckOfCard class, only getters setters and constructor are here
 */

public class Cards {


    private URL filePath;
    private  int value;

    //region getters, setters and constructor

    public URL getFilePath() {
        return filePath;
    }

    public void setFilePath(URL filePath) {
        this.filePath = filePath;
    }

    public int getValue() {
        return value;
    }


    public Cards(URL filePath, int value) {
        this.filePath = filePath;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //endregion
}
