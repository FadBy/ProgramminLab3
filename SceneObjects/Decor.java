package SceneObjects;

public class Decor extends SceneObject {
    private Sound sound;
    private String soundText;

    public Decor(String name, String soundText) {
        super(name);
        this.soundText = soundText;
        sound = new Sound(name, soundText);
    }

    public void makeNoise() {
        sound.play();
    }

    @Override
    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (object.getClass() == this.getClass()){
            Decor decor = (Decor)object;
            if (name == decor.name && soundText == decor.soundText){
                
            }
        }
    }
}
