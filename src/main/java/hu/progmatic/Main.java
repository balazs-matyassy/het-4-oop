package hu.progmatic;

import hu.progmatic.model.City;
import hu.progmatic.model.PlaneTravel;
import hu.progmatic.model.TrainTravel;
import hu.progmatic.model.Travel;

public class Main {
    public static void main(String[] args) {
        City budapest = new City("CITY001", "Budapest", "HU", 47.50, 19.04);
        City gyor = new City("CITY002", "Győr", "HU", 47.68, 17.65);
        Travel trainTravel = new TrainTravel(budapest, gyor);
        System.out.println(trainTravel);
        Travel planeTravel = new PlaneTravel(budapest, gyor);
        System.out.println(planeTravel);
    }
}
