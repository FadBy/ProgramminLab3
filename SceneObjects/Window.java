package SceneObjects;

public class Window extends SceneObject implements Actable {
    public boolean isOpened;
    private Decor decor;

    public Window(boolean isOpened, Decor decor) {
        super("Окно");
        this.isOpened = isOpened;
        this.decor = decor;
    }

    public Window(boolean isOpened) {
        this(isOpened, null);
    }

    @Override
    public boolean act() {
        if (isOpened && decor != null) {
            decor.makeNoise();
        }
        return true;
    }
}
