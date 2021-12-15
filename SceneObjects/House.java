package SceneObjects;

public class House extends SceneObject implements Building {
    private Roof roof;
    private Window[] windows;
    private int coord;

    public House(Roof roof, int coord, Window[] windows) {
        super("Дом" + coord);
        this.roof = roof;
        this.windows = windows;
        this.coord = coord;
    }

    public int getCoord() {
        return coord;
    }

    public static boolean AreHousesClose(House first, House second) {
        return Math.abs(first.getCoord() - second.getCoord()) <= 1;
    }

    public Roof getRoof() {
        return roof;
    }

    public Window[] getWindows() {
        return windows;
    }
}
