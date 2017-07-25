/**
 * Created by kulkarmu on 7/25/2017.
 */
public class EmailService {

    private final LocationService locationService = new LocationService();
    private final SecurityServices securityServices = new SecurityServices();

    void sendEmail(String user, String email, String message) {
        if (checkLocation(locationService.retrieveLocation(email))) {
            if (securityServices.checkPermission(user)) {
                if (exists(email)) {
                    System.out.println("Email is sent to " + email + " with message : " + message);
                }
            }
        }
    }


    String retrieveLocation(String email) {
        //20 loc to check with Webservice
        return locationService.retrieveLocation(email);
    }

    boolean exists(String email) {
        //20 loc to check in DB
        if (email.endsWith("@yahoo.com")) {
            return true;
        } else {
            return false;
        }
    }

    boolean checkPermission(String user) {
        //20 loc to check in DB
        return securityServices.checkPermission(user);
    }

    boolean checkLocation(String location) {
        //20 loc to check in DB
        return locationService.checkLocation(location);
    }

}

