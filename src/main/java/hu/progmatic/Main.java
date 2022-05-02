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
        HasTime[] hasTimes = {
                travels[0],
                travels[1],
                activities[0],
                activities[1]
        };
        HasPrice[] hasPrices = {
                travels[0],
                travels[1],
                products[0],
                products[1]
        };

        System.out.println("Összes eltöltött idő: " + getTotalTime(hasTimes));
        System.out.println("Összes utazással töltött idő: " + getTotalTime(travels));
        System.out.println("Összes elköltött pénz:" + getTotalPrice(hasPrices));
        System.out.println("Összes utazásra költött pénz: " + getTotalPrice(travels));
        System.out.println("P betűs közlekedési eszközökön töltött idő: " + getTotalTimeSpentOnVehiclesStartingWithP(hasTimes));
        System.out.println("Repülön töltött összes idő: " + getTotalTimeSpentOnPlane(hasTimes));
    }

    /*
    Azért nem tudjuk az Activity-ket megadni, mivel azoknak pl. nincs distance metódusa.
    A distance metódusra SEMMI szükség nincsen az összes idő számítása szempontjából,
    tehát a felesleges függőség miatt jelentősen szűkítem az amúgy általános metódusom felhasználhatóságát.
     */
    /*private static double getTotalTime(Travel[] travels) {
        double total = 0.0;

        for (Travel travel : travels) {
            total += travel.getTime();
        }

        return total;
    }*/

    private static double getTotalTime(HasTime[] hasTimes) {
        double total = 0.0;

        for (HasTime hasTime : hasTimes) {
            total += hasTime.getTime();
        }

        return total;
    }

    private static double getTotalTimeSpentOnVehiclesStartingWithP(HasTime[] hasTimes) {
        double total = 0.0;

        for (HasTime hasTime : hasTimes) {
            if (hasTime instanceof Travel) {
                Travel travel = (Travel) hasTime;

                if (travel.getVehicle().startsWith("P")) {
                    total += travel.getTime();
                }
            }
        }

        return total;
    }

    public static double getTotalTimeSpentOnPlane(HasTime[] hasTimes) {
        double total = 0.0;

        for (HasTime hasTime : hasTimes) {
            if (hasTime instanceof  PlaneTravel) {
                total += hasTime.getTime();
            }
        }

        return total;
    }

    private static double getTotalPrice(HasPrice[] hasPrices) {
        double total = 0.0;

        for (HasPrice hasPrice : hasPrices) {
            total += hasPrice.getPrice();
        }

        return total;
    }

    /*private static double getTotalPrice(Product[] products) {
        double total = 0.0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }*/
}
