package SceneObjects;

public abstract class SceneObject {
    protected String name;

    public String getName() {
        return name;
    }

    public SceneObject(String name) {
        this.name = name;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null){
    //         return false;
    //     }
    //     if (obj.getClass() == getClass()) {
    //         SceneObject sceneObj = (SceneObject) obj;
    //         if (sceneObj.id == id) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // @Override
    // public String toString() {
    //     return id + ": " + name;
    // }

    // @Override
    // public int hashCode() {
    //     return id;
    // }
}
