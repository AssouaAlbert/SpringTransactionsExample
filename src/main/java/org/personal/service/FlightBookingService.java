package org.personal.service;

import java.util.UUID;

import org.personal.dto.FlightBookingAcknowledgement;
import org.personal.dto.FlightBookingRequest;
import org.personal.entity.PassengerInfo;
import org.personal.entity.PaymentInfo;
import org.personal.respository.PassengerInfoRepo;
import org.personal.respository.PaymentInfoRepo;
import org.personal.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepo passengerInfoRepo;
    @Autowired
    private PaymentInfoRepo paymentInfoRepo;

    @Transactional //(readOnly =  false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.MANDATORY)
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfoRepo.save(passengerInfo);
        /* -------------------------------------------------------------------------- */
        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepo.save(paymentInfo);
        /* -------------------------------------------------------------------------- */

        return new FlightBookingAcknowledgement("Success", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);

    }
}
