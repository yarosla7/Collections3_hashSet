package transport;

public interface Competing {
    void pitStop();

    void bestLapTime();

    void maxSpeed();

    void crashed(); // для реалистичности)
}