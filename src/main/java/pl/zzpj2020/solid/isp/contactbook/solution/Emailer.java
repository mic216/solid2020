package pl.zzpj2020.solid.isp.contactbook.solution;

public interface Emailer {
    public void sendMessage(Contact contact, String subject, String body);
    public void sendEmail(String email, String subject, String body);
}
