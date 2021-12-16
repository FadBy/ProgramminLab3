package SceneObjects;

public abstract class SceneObject {
    protected String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public SceneObject(String name) {
        this.name = name;
        id = IdGetter.getNextId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj.getClass() == getClass()) {
            SceneObject sceneObj = (SceneObject) obj;
            if (sceneObj.id == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
