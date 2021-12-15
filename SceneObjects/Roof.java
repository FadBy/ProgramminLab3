package SceneObjects;

public class Roof extends SceneObject {
    private AngleType angle = AngleType.Bizarre;

    public Roof() {
        super("Крыша");
    }

    public Roof(AngleType angle) {
        this();
        this.angle = angle;
    }

    public AngleType getAngle() {
        return angle;
    }
}
