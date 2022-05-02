package hu.progmatic.model;

public final class Activity {
    private String name;
    private double time;

    public Activity() {
    }

    public Activity(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
