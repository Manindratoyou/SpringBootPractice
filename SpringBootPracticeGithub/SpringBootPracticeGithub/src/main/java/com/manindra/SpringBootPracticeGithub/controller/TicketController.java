package com.manindra.SpringBootPracticeGithub.controller;

import com.manindra.SpringBootPracticeGithub.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    //http://localhost:8080/api/tickets/book?numTickets=2
    @PostMapping("/book")
    public String bookTicket(@RequestParam int numTickets) {
        boolean booked = ticketService.bookTicket(numTickets);
        if (booked) {
            return numTickets + " ticket(s) booked successfully!";
        } else {
            return "Tickets not available for booking.";
        }
    }

    @GetMapping("/availability")
    public String checkAvailability() {
        int availableTickets = ticketService.checkAvailability();
        return "Available tickets: " + availableTickets;
    }
}

