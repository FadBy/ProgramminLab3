public class Scene {
    private TimeOfDay timeOfDay = TimeOfDay.Evening;
    private boolean dangerous = true;

    private EventSystem eventSystem;
    private ObjectsHolder objHolder;

    public Scene() {
        eventSystem = new EventSystem();
        objHolder = new ObjectsHolder();
        objHolder.loadEvents(eventSystem);
    }

    public void Run(){
        eventSystem.StartAction();
    }

    public TimeOfDay getTimeOfDay(){
        return timeOfDay;
    }

    public boolean getDangerous(){
        return dangerous;
    }
}
