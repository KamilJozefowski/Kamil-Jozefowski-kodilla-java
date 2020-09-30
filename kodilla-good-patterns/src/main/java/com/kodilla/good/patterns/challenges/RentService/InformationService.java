package com.kodilla.good.patterns.challenges.RentService;

public class InformationService {
    private final User user;
    private boolean sentMail;
    private boolean sentSMS;

    public InformationService(User user) {
        this.user = user;
    }

    public void inform(User user) {
        System.out.println("Send mail to " + user);
        sentMail = true;
        System.out.println("Send SMS to " + user);
        sentSMS = true;

    }
}
