enum TrafficLight {
    RED, GREEN, YELLOW;
}

class TrafficSignal {
    private TrafficLight current;

    public TrafficSignal() {
        this.current = TrafficLight.RED;
    }

    public void switchLight() {
        switch (current) {
            case RED:
                current = TrafficLight.GREEN;
                break;
            case GREEN:
                current = TrafficLight.YELLOW;
                break;
            case YELLOW:
                current = TrafficLight.RED;
                break;
        }
    }

    public TrafficLight getCurrentLight() {
        return current;
    }

    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        for (int i = 0; i < 6; i++) {
            System.out.println("Current Light: " + signal.getCurrentLight());
            signal.switchLight();
        }
    }
}