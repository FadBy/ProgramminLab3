package SceneObjects;

public class Karlson extends SceneObject implements Actable {
    private Sound catchSound;
    private String catchText = "Хвать...";

    public Karlson() {
        super("Карлсон");
        catchSound = new Sound(name, catchText);
    }

    @Override
    public boolean act() {
        catchMalish();
        return true;
    }

    private void catchMalish() {
        catchSound.play();
    }
}
