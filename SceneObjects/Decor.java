package SceneObjects;

public class Decor extends SceneObject {
    private Sound sound;

    public Decor(String name, String soundText) {
        super(name);
        sound = new Sound(name, soundText);
    }

    public void makeNoise() {
        sound.play();
    }
}
