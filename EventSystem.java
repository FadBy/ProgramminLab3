import java.util.ArrayList;
import SceneObjects.Actable;

public class EventSystem {
    private ArrayList<Actable> actions;

    public EventSystem() {
        actions = new ArrayList<>();
    }

    public void StartAction() {
        for (int i = 0; i < actions.size(); i++) {
            actions.get(i).act();
        }
    }

    public void addNextEvent(Actable event, int count) {
        for (int i = 0; i < count; i++) {
            actions.add(event);
        }
    }

    public void insertEvent(int index, Actable event) {
        actions.add(index, event);
    }
}
