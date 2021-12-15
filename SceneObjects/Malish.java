package SceneObjects;

import java.util.ArrayList;

public class Malish extends SceneObject implements Actable {
    private Sound walkSound;
    private Sound jumpSound;
    private Sound fallSound;
    private Sound heartSound;
    private final String walkText = "Топ-топ-топ";
    private final String jumpText = "Прыг-скок";
    private final String fallText = "Я падаю-ю-ю";
    private final String heartText = "Тук-тук тук-тук";
    private final String heartName = "Сердце Малыша";
    private boolean jumpWalkSwitch = true;
    private ArrayList<House> houses;
    private int houseIter = 0;
    private Roof currentRoof;
    private House currentHouse;
    private boolean afraid = false;

    public Malish(ArrayList<House> houses) {
        super("Малыш");
        this.houses = houses;
        walkSound = new Sound(name, walkText);
        jumpSound = new Sound(name, jumpText);
        fallSound = new Sound(name, fallText);
        heartSound = new Sound(heartName, heartText);
        setCurrentHouse(houses.get(0));
    }

    private void climb() {
        if (afraid) {
            heartSound.play();
        }
        walkSound.play();
    }

    private void jump() {
        if (afraid) {
            heartSound.play();
        }
        jumpSound.play();
    }

    private void fall() {
        fallSound.play();
        afraid = true;
    }

    private void setCurrentHouse(House house) {
        currentHouse = house;
        currentRoof = house.getRoof();
    }

    private House getNextHouse() {
        if (houseIter >= houses.size()) {
            return null;
        }
        return houses.get(houseIter++);
    }

    private boolean moveToNextHouse() {
        House nextHouse = getNextHouse();
        if (nextHouse == null) {
            return false;
        }
        if (House.AreHousesClose(nextHouse, currentHouse)) {
            setCurrentHouse(nextHouse);
            return true;
        } else {
            setCurrentHouse(nextHouse);
            return false;
        }
    }

    public boolean act() {
        if (jumpWalkSwitch) {
            if (moveToNextHouse())
                jump();
            else {
                fall();
            }
        } else {
            climb();
        }
        jumpWalkSwitch = !jumpWalkSwitch;
        return true;
    }

    public Roof getRoof() {
        return currentRoof;
    }
}