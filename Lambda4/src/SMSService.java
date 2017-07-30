/**
 * Created by kulkarmu on 7/30/2017.
 */
public class SMSService {
    static void sendSMS(String from, String to, String receiverID, String message, MessageSender ms) {
        ms.send(from, to, receiverID, message);
    }
}
