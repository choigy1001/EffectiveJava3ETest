package chapter6.item34;

public enum DayTime {
    MORNING(0),
    AFTERNOON(1),
    NIGHT(2);

    private final int value;

    DayTime(int value) {
        this.value = value;
    }
}
