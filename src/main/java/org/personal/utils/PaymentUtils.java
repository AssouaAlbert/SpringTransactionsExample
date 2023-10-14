package org.personal.utils;

import java.util.HashMap;
import java.util.Map;

import org.personal.exception.InsufficientAmount;

public class PaymentUtils {
    private static Map<String, Double> paymentMap = new HashMap<>();

    {
        paymentMap.put("acc1", 12000.00);
        paymentMap.put("acc2", 10000.00);
        paymentMap.put("acc3", 5000.00);
        paymentMap.put("acc4", 8000.00);
        paymentMap.put("acc5", 2000.00);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount) {
        if (paidAmount >= paymentMap.get(accNo)) {
            throw new InsufficientAmount("Insufficient amount in account.");
        }
        return true;
    }
}