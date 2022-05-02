package hu.progmatic.model;

public final class PlaneTravel extends Travel {
    public PlaneTravel() {
    }

    public PlaneTravel(City cityFrom, City cityTo) {
        super(cityFrom, cityTo);
    }

    @Override
    public double getTime() {
        return 2.0 + getDistance() / 800.0;
    }

    @Override
    public double getPrice() {
        if (getDistance() <= 1000.0) {
            return 20_000.0;
        } else if (getDistance() <= 2500.0) {
            return 50_000.0;
        } else {
            return 100_000.0;
        }
    }

    @Override
    public String getVehicle() {
        return "Plane";
    }
}
