package SceneObjects;

public class Street extends SceneObject implements Actable {
    private Decor[] decorOutside;
    private int iter = 0;

    public Street(Decor[] decorOutside) {
        super("Улица");
        this.decorOutside = decorOutside;

    }

    public boolean act() {
        if (iter >= decorOutside.length) {
            return false;
        }
        decorOutside[iter].makeNoise();
        iter++;
        return false;
    }
}
