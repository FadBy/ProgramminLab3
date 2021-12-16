package SceneObjects;

public class IdGetter{
    static int idIter = 0;

    static int getNextId(){
        return idIter++;
    }
}