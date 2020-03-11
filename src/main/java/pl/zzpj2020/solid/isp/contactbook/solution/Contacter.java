package pl.zzpj2020.solid.isp.contactbook.solution;

public class Contacter implements Emailer, Dialler {
    @Override
    public void makeCall(Contact contact) {
        String telephone = contact.getTelephone();
    }

    @Override
    public void sendMessage(Contact contact, String subject, String body) {
        String email = contact.getEmail();
        sendEmail(email, subject, body);
    }

    @Override
    public void sendEmail(String email, String subject, String body) {

    }
}
