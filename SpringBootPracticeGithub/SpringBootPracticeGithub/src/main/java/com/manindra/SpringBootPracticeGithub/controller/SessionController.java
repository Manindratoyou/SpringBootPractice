package com.manindra.SpringBootPracticeGithub.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/session")
public class SessionController {

    @PostMapping("/create")
    public String createSession(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(60); // Set session timeout to 60 seconds
        return "Session created with ID: " + session.getId();
    }

    @GetMapping("/check")
    public String checkSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            return "Session exists with ID: " + session.getId();
        } else {
            return "No active session.";
        }
    }

    @PostMapping("/destroy")
    public String destroySession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
            return "Session destroyed.";
        } else {
            return "No active session to destroy.";
        }
    }
}

