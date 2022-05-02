package hu.progmatic.model;

/**
 * Öröklődés:
 * - halmaz - részhalmaz kapcsolat (vonatos utazások is utazások)
 * - programozói szemmel nagy segítség az ősosztály metódusainak az átvétele,
 *      csak a szükséges metódusok implementációját kell "kicserélni" @Override segítségével.
 *
 * - final: NEM szabad megváltoztatni az implementációt
 * - -: fejlesztőre van bízva (van értelmes default implementáció, ami változhat)
 * - absztact: KÖTELEZŐ megváltoztatni az implementációt (nincs értelmes default)
 *
 * Utazások általános (distance, returnDistance, returnTime, returnPrice)
 * és közlekedési eszközre jellemző metódusokkal rendelkeznek (time, price, vehicle).
 *
 * Az általános metódusok soha nem változhatnak (mindegy, hogy milyen közlekedési eszközről beszélünk),
 * emiatt a final kulcsszó segítségével meg tudjuk akadályozni, hogy véletlenül felülírjuk a metódusokat.
 * (Ezeket NEM szabad "kicserélni".)
 *
 * A közlekedési eszközre jellemző metódusokról viszont semmit nem tudunk általánosságban mondani,
 * emiatt azokat KÖTELEZŐ "kicserélni".
 * Az abstract kulcsszó segítségével meg tudjuk akadályozni, hogy véletlenül megfeledkezzünk a "cseréről".
 */
public abstract class Travel implements HasTime, HasPrice {
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

    public abstract double getTime();

    public final double getReturnTime() {
        return getTime() * 2.0;
    }

    public abstract double getPrice();

    public final double getReturnPrice() {
        return getPrice() * 2.0;
    }

    public abstract String getVehicle();

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
