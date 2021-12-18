package SceneObjects;

import java.util.ArrayList;
import java.util.function.Function;

public class Sound {
    private String text;
    private String source;

    public Sound(String source, String text) {
        this.source = source;
        this.text = text;
    }

    public void play() {
        System.out.println(this.source + ": " + this.text);
    }
}
