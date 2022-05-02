package hu.progmatic;

import hu.progmatic.model.*;

public class Main {
    public static void main(String[] args) {
        City budapest = new City("CITY001", "Budapest", "HU", 47.50, 19.04);
        City gyor = new City("CITY002", "Győr", "HU", 47.68, 17.65);
        Travel[] travels = {
                new TrainTravel(budapest, gyor),
                new PlaneTravel(budapest, gyor)
        };
        Activity[] activities = {
                new Activity("sétálás", 1.0),
                new Activity("mozizás", 2.5)
        };
        Product[] products = {
                new Product("mogyoró", 500.0),
                new Product("sör", 169.0)
        };
    }
}
