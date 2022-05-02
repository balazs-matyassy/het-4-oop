package hu.progmatic.model;

public final class TrainTravel extends Travel {
    public TrainTravel() {
    }

    public TrainTravel(City cityFrom, City cityTo) {
        super(cityFrom, cityTo);
    }

    @Override
    public double getTime() {
        return getDistance() / 100.0;
    }

    @Override
    public double getPrice() {
        return getDistance() * 20.0;
    }

    @Override
    public String getVehicle() {
        return "Train";
    }
}
