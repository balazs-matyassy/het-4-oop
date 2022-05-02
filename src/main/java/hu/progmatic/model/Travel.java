package hu.progmatic.model;

public class Travel {
    private City cityFrom;
    private City cityTo;

    public Travel() {
    }

    public Travel(City cityFrom, City cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public final City getCityFrom() {
        return cityFrom;
    }

    public final void setCityFrom(City cityFrom) {
        this.cityFrom = cityFrom;
    }

    public final City getCityTo() {
        return cityTo;
    }

    public final void setCityTo(City cityTo) {
        this.cityTo = cityTo;
    }

    public final double getDistance() {
        return cityFrom.getDistanceTo(cityTo);
    }

    public final double getReturnDistance() {
        return getDistance() * 2.0;
    }

    public double getTime() {
        return Double.MAX_VALUE;
    }

    public final double getReturnTime() {
        return getTime() * 2.0;
    }

    public double getPrice() {
        return Double.MAX_VALUE;
    }

    public final double getReturnPrice() {
        return getPrice() * 2.0;
    }

    public String getVehicle() {
        return null;
    }

    @Override
    public final String toString() {
        return "Travel{" +
                "cityFrom=" + cityFrom +
                ", cityTo=" + cityTo +
                ", distance=" + getDistance() +
                ", returnDistance=" + getReturnDistance() +
                ", time=" + getTime() +
                ", returnTime=" + getReturnTime() +
                ", price=" + getPrice() +
                ", returnPrice=" + getReturnPrice() +
                ", vehicle=" + getVehicle() +
                '}';
    }
}
