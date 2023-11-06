package org.lessons.java.train.model;

public class Ticket {
    private int kilometersToTravel;
    private int userAge;
    private double fixedPrice = 0.21;
    private double partialTicketPrice;
    private double finalTicketPrice;

    public Ticket(int kilometersToTravel, int userAge) {
        this.kilometersToTravel = kilometersToTravel;
        this.userAge = userAge;
    }

    public int getKilometersToTravel() {
        return kilometersToTravel;
    }

    public void setKilometersToTravel(int kilometersToTravel) {
        this.kilometersToTravel = kilometersToTravel;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        if (userAge < 0)
            throw new IllegalArgumentException();
        this.userAge = userAge;
    }

    public double getFixedPrice() {
        return fixedPrice;
    }

    public double calculatePartialTicketPrice() {
        return partialTicketPrice =  fixedPrice * kilometersToTravel;
    }

    public double calculateFinalTicketPrice() {
        if (userAge < 18) {
            return partialTicketPrice - (partialTicketPrice * 20 / 100);
        } else if (this.userAge > 65) {
            return partialTicketPrice- (partialTicketPrice * 40 / 100);
        } else {
            return partialTicketPrice;
        }
    }
}
