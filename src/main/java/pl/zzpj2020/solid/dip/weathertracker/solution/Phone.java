package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Phone implements Contact {
    @Override
    public String generateMessage(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
