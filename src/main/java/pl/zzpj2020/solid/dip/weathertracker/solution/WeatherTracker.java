package pl.zzpj2020.solid.dip.weathertracker.solution;

public class WeatherTracker {
    private String currentConditions;
    private Contact contact;

    public WeatherTracker(final String currentConditions, final Contact contact) {
        this.currentConditions = currentConditions;
        this.contact = contact;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = contact.generateMessage(currentConditions);
        System.out.println(alert);
    }
}
