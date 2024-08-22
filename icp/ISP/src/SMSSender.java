public class SMSSender {
    public static void sendSMS(SMSable c, String message) {
        // Envía un mensaje SMS al teléfono proporcionado por el contacto
        System.out.println("Enviando SMS a " + c.getTelephone() + " con el mensaje: " + message);
    }
}
