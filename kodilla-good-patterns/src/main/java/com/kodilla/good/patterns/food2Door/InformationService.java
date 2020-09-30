package com.kodilla.good.patterns.food2Door;
import com.kodilla.good.patterns.challenges.RentService.User;

public class InformationService {
    private final Customer customer;
    private boolean sentMail = false;
    private boolean sentSMS = false;

    public InformationService(Customer customer) {
        this.customer = customer;
    }

    public void inform(Customer customer) {
        System.out.println("Send mail to " + customer.getName());
        sentMail = true;
        System.out.println("Send SMS to " + customer.getName());
        sentSMS = true;

    }
}
