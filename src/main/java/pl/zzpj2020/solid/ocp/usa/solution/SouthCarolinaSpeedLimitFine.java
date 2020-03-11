package pl.zzpj2020.solid.ocp.usa.solution;

public class SouthCarolinaSpeedLimitFine implements USAStateSpeedLimitFine {
    private static final int MAX_SPEED = 120;
    private static final int FINE = 12;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        return speed > MAX_SPEED ? (speed - MAX_SPEED) * FINE : 0;
    }
}
