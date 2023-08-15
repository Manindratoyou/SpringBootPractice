package com.manindra.SpringBootPracticeGithub.service;

public interface TicketService {

    boolean bookTicket(int numTickets);

    int checkAvailability();
}

