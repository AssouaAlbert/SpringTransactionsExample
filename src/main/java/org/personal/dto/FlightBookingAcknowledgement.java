package org.personal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.personal.entity.PassengerInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    private  String status;
    private double totalFare;
    private  String pnrNo;
    private PassengerInfo passengerInfo;
}
