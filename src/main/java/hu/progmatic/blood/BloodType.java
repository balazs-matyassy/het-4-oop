package hu.progmatic.blood;

public enum BloodType {
    BLOOD_A("A vércsoport"),
    BLOOD_B("B vércsoport"),
    BLOOD_AB("AB vércsoport"),
    BLOOD_0("0 vércsoport");

    private final String hungarian;

    BloodType(String hungarian) {
        this.hungarian = hungarian;
    }

    public String getHungarian() {
        return hungarian;
    }

    public boolean canDonateTo(BloodType bloodType) {
        if (this == bloodType) {
            return true;
        } else {
            return this == BLOOD_0 || bloodType == BLOOD_AB;
        }
    }

    public boolean canReceiveFrom(BloodType bloodType) {
        if (this == bloodType) {
            return true;
        } else {
            return this == BLOOD_AB || bloodType == BLOOD_0;
        }
    }
}
