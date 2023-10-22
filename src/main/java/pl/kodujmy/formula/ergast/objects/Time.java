package pl.kodujmy.formula.ergast.objects;


public class Time {
    private int millis;
    private String time;

    public Time(int millis, String time) {
        this.millis = millis;
        this.time = time;
    }

    public int getMillis() {
        return millis;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Time{" +
                "millis=" + millis +
                ", time='" + time + '\'' +
                '}';
    }
}
