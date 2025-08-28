abstract class Crop {
    String name;
    Crop(String name) {
        this.name = name;
    }
    abstract int waterRequirement();
    abstract void harvest();
}

class Rice extends Crop {
    Rice() { super("Rice"); }

    int waterRequirement() {
        return 100; // liters per acre
    }

    void harvest() {
        System.out.println("Harvesting rice...");
    }
}

class Wheat extends Crop {
    Wheat() { super("Wheat"); }

    int waterRequirement() {
        return 50; // liters per acre
    }

    void harvest() {
        System.out.println("Harvesting wheat...");
    }
}

public class SmartFarmingSystem {
    public static void main(String[] args) {
        Crop rice = new Rice();
        Crop wheat = new Wheat();
        System.out.println(rice.name + " needs " + rice.waterRequirement() + " liters of water.");
        rice.harvest();
        System.out.println(wheat.name + " needs " + wheat.waterRequirement() + " liters of water.");
        wheat.harvest();
    }
}