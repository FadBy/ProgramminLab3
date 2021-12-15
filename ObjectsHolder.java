import java.util.ArrayList;

import SceneObjects.*;

public class ObjectsHolder {
    private ArrayList<SceneObject> objects = new ArrayList<SceneObject>();
    private ArrayList<House> houses = new ArrayList<House>();
    private ArrayList<Window> windows = new ArrayList<Window>();
    private ArrayList<Decor> decors = new ArrayList<Decor>();
    private ArrayList<Roof> roofs = new ArrayList<Roof>();
    private int houseIter = 0;
    private Malish malish;
    private Karlson karlson;
    private Street street;

    public ObjectsHolder() {
        loadObjects();
    }

    public void loadEvents(EventSystem eventSystem) {
        for (int i = 0; i < windows.size(); i++) {
            eventSystem.addNextEvent(windows.get(i), 1);
        }
        eventSystem.addNextEvent(street, 3);
        eventSystem.addNextEvent(malish, 5);
        eventSystem.addNextEvent(karlson, 1);
        eventSystem.addNextEvent(malish, 2);
    }

    private void loadObjects() {

        decors.add(new Decor("Тихий разговор людей", "бла-бла-бла"));
        decors.add(new Decor("Детский смех", "Хе-хе"));
        decors.add(new Decor("Звяканье посуды", "Звяк-звяк"));
        decors.add(new Decor("Детский плач", "а-а-а"));
        decors.add(new Decor("Лай собаки", "гав-гав"));
        decors.add(new Decor("Бренчание на пианино", "До-ре-ми-фа-соль"));
        decors.add(new Decor("Мотоцикл", "Врум-врум"));
        decors.add(new Decor("Цокот копыт", "Цок-цок"));
        decors.add(new Decor("Тарахтение телеги", "Тарах-тарах"));
        windows.add(new Window(true, decors.get(0)));
        windows.add(new Window(true, decors.get(1)));
        windows.add(new Window(true, decors.get(2)));
        windows.add(new Window(true, decors.get(3)));
        windows.add(new Window(true, decors.get(4)));
        windows.add(new Window(true, decors.get(5)));
        roofs.add(new Roof());
        roofs.add(new Roof());
        roofs.add(new Roof());
        roofs.add(new Roof());
        houses.add(new House(roofs.get(0), 0, new Window[] {
                windows.get(0),
                windows.get(1),
                windows.get(2)
        }));
        houses.add(new House(roofs.get(1), 1, new Window[] {
                windows.get(2),
                windows.get(3),
                windows.get(4)
        }));
        houses.add(new House(roofs.get(2), 3, new Window[] {
                windows.get(5),
        }));
        houses.add(new House(roofs.get(3), 4, new Window[0]));
        street = new Street(new Decor[] {
            decors.get(6),
            decors.get(7),
            decors.get(8)
        });
        malish = new Malish(houses);
        karlson = new Karlson();
        objects.add(malish);
        for (int i = 0; i < houses.size(); i++) {
            objects.add(houses.get(i));
        }
        objects.add(street);
    }

    public House getNextHouse() {
        if (houseIter >= houses.size()) {
            return null;
        }
        return houses.get(houseIter++);
    }

    public House getStartingHouse() {
        if (houses.size() == 0) {
            return null;
        }
        return houses.get(0);
    }

    public Malish getMalish() {
        return malish;
    }
}
