package pl.zzpj2020.solid.ocp.usa.solution;

public class AlabamaSpeedLimitFine implements USAStateSpeedLimitFine {
    private static final int MAX_SPEED = 113;
    private static final int FINE = 11;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        return speed > MAX_SPEED ? (speed - MAX_SPEED) * FINE : 0;
    }
}
