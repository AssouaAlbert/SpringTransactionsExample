package org.personal.respository;

import java.util.ArrayList;
import java.util.List;

import org.personal.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long>
{
// public class PassengerInfoRepo {
//     List<PassengerInfo> passengers = new ArrayList();

//     public void save(PassengerInfo passengerInfo) {
//         passengers.add(passengerInfo);
//     }
}
