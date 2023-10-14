package org.personal.respository;

import org.personal.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepo  extends JpaRepository<PaymentInfo, Long> {
}
