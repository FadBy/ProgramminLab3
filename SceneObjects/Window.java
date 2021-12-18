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

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() == this.getClass()) {
            Window window = (Window) object;
            return window.decor.equals(decor) && window.isOpened == isOpened;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return decor.hashCode() + (isOpened ? 1 : 0);
    }

    @Override
    public String toString() {
        return (isOpened ? "Открытое" : "Закрытое") + "окно: " + decor.toString();
    }
}
