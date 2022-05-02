package hu.progmatic.model;

import java.util.Objects;

public final class City {
    public static final double KM_PER_DEG = 111.0;

    private final String id;
    private String name;
    private String countryCode;
    private double latitude;
    private double longitude;

    public City(String id) {
        this.id = id;
    }

    public City(String id, String name, String countryCode, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static double getDistance(City cityFrom, City cityTo) {
        double dlat = (cityFrom.latitude - cityTo.latitude) * KM_PER_DEG;
        double dlong = (cityFrom.longitude - cityTo.longitude) * KM_PER_DEG;

        return Math.sqrt(dlat * dlat + dlong * dlong);
    }

    public double getDistanceTo(City cityTo) {
        return getDistance(this, cityTo);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id.equals(city.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
