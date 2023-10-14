package org.personal.service;

import org.personal.dto.FlightBookingAcknowledgement;
import org.personal.dto.FlightBookingRequest;
import org.personal.entity.PassengerInfo;
import org.personal.respository.PassengerInfoRepo;
import org.personal.respository.PaymentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightBookingService {
    @Autowired
    private PassengerInfoRepo passengerInfoRepo;
    @Autowired
    private PaymentInfoRepo paymentInfoRepo;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
        FlightBookingRequest acknowledgement = null;
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepo.save(passengerInfo);
        return null;
    }
}
