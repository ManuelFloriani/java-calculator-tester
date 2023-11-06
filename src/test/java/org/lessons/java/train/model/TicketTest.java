package org.lessons.java.train.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    void calculateFinalTicketPrice() {
        Ticket ticket = new Ticket(10, 20);
        ticket.calculatePartialTicketPrice();
        assertEquals(2.1, ticket.calculateFinalTicketPrice());
        Ticket ticket2 = new Ticket(10, 17);
        ticket2.calculatePartialTicketPrice();
        assertEquals(1.6800000000000002, ticket2.calculateFinalTicketPrice());
        Ticket ticket3 = new Ticket(10, 66);
        ticket3.calculatePartialTicketPrice();
        assertEquals(1.2600000000000002, ticket3.calculateFinalTicketPrice());
    }
}