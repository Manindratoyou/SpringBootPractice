package com.manindra.SpringBootPracticeGithub.service.impl;

import com.manindra.SpringBootPracticeGithub.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    private int availableTickets = 10;

    @Override
    public synchronized boolean bookTicket(int numTickets) {
        if (numTickets <= availableTickets) {
            availableTickets -= numTickets;
            return true;
        }
        return false;
    }

    @Override
    public int checkAvailability() {
        return availableTickets;
    }
}

