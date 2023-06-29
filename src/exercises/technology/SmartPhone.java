package exercises.technology;

public class SmartPhone extends Computer {

    private int numberOfPics;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
        super(storage, ram, hasKeyboard);
        this.numberOfPics = numberOfSelfies;
    }

    public void takeSelfie() {
        this.numberOfPics = this.numberOfPics + 1;
    }

    public int getNumberOfSelfies() {
        return this.numberOfPics;
    }
}
