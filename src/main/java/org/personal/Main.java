package org.personal;

import org.personal.dto.FlightBookingAcknowledgement;
import org.personal.dto.FlightBookingRequest;
import org.personal.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableTransactionManagement
@RestController
public class Main {

    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        System.out.println("request: " + request);
        return service.bookFlightTicket(request);
    }

    @GetMapping("/")
    public String bookFlightTicket() {
        return "Welcome!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}