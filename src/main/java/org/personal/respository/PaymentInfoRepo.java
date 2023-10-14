package org.personal.respository;

import java.util.ArrayList;
import java.util.List;

import org.personal.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
// public interface PaymentInfoRepo  extends JpaRepository<PaymentInfo, Long> {
public class PaymentInfoRepo  {
        List<PaymentInfo> payments = new ArrayList();

    public void save(PaymentInfo paymentInfo) {
        payments.add(paymentInfo);
    }
}
