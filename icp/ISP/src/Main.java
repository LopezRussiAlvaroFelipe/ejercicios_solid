public class Main {
    public static void main(String[] args) {
        // Crear un objeto GmailAccount
        GmailAccount gmailAccount = new GmailAccount("John Doe", "johndoe@gmail.com");

        // Enviar un email usando EmailSender
        EmailSender.sendEmail(gmailAccount, "Hola, este es un mensaje para ti.");

        // Crear un objeto Contacto
        Contacto contacto = new Contacto();
        contacto.setName("Jane Doe");
        contacto.setEmailAddress("janedoe@gmail.com");
        contacto.setTelephone("123456789");

        // Enviar email y SMS usando Contacto
        EmailSender.sendEmail(contacto, "Este es un email para Jane.");
        SMSSender.sendSMS(contacto, "Este es un SMS para Jane.");
    }
}
