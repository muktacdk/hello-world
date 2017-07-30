/**
 * Created by kulkarmu on 7/30/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmailService.sendMail("Mukta", "Dipali", "abc@gmail.com", "Good Morning", (from, to, receiverID, message) -> {
            System.out.printf("Email is sent from %s to %s having ID %s and message is : %s%n", from, to, receiverID, message);
        });
        System.out.println("=======================");
        SMSService.sendSMS("Mukta", "Dipali", "7588", "Good Morning", (from, to, receiverID, message) -> {
            System.out.printf("SMS is sent from %s to %s having ID %s and message is : %s%n", from, to, receiverID, message);
        });

        System.out.println("=======================");
        WhatsAppService.sendMessage("Mukta", "Dipali", "7588", "Good Morning", (from, to, receiverID, message) -> {
            System.out.printf("WhatsApp message is sent from %s to %s having ID %s and message is : %s%n", from, to, receiverID, message);
        });
    }
}
