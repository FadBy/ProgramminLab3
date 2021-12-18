package SceneObjects;

public class House extends SceneObject implements Building {
    private Roof roof;
    private Window[] windows;
    private int coord;

    public House(Roof roof, int coord, Window[] windows) {
        super("Дом");
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

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() == this.getClass()) {
            House other = (House) object;
            return windows.equals(other.windows) && coord == other.coord && roof.equals(other.roof);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int sum = roof.hashCode() + coord;
        for (Window window : windows) {
            sum += window.hashCode();
        }
        return sum;
    }

    @Override
    public String toString() {
        return name + ": " + coord;
    }
}
