/**
 * Created by kulkarmu on 7/30/2017.
 */
public interface MessageSender {
    void send(String from, String to, String receiverID, String message);
}
