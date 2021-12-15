package SceneObjects;

public abstract class SceneObject {
    protected String name;

    public String getName() {
        return name;
    }

    public SceneObject(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == getClass()) {
            SceneObject sceneObj = (SceneObject) obj;
            if (sceneObj.name == name) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
