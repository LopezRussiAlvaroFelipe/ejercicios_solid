public class EmailSender {
    public static void sendEmail(Emailable c, String message) {
        // Envía un mensaje a la dirección de correo proporcionada por el contacto
        System.out.println("Enviando email a " + c.getEmailAddress() + " con el mensaje: " + message);
    }
}

