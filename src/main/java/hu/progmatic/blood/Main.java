package hu.progmatic.blood;

public class Main {
    public static void main(String[] args) {
        /* Object printable = BloodType.BLOOD_A;

        if (BloodType.BLOOD_A == BloodType.BLOOD_A) {
            System.out.println("IGAZ");
        }

        if (BloodType.BLOOD_A.equals(BloodType.BLOOD_A)) {
            System.out.println("IGAZ");
        }

        System.out.println(printable); */

        BloodType donor = BloodType.BLOOD_0;
        BloodType acceptor = BloodType.BLOOD_B;
        System.out.println(donor.canDonateTo(acceptor));
    }
}
