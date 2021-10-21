package com.HW3.demo.service.payment;

import com.HW3.demo.enums.PaymentType;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PaymentFactory {
    private Map<PaymentType,Payment> paymentMap;

    public PaymentFactory(List<Payment> payments){
        this.paymentMap = payments.stream().
                collect(Collectors.toMap(Payment::getType,payment -> payment));
    }

    public Payment getType(PaymentType paymentType){
        return paymentMap.get(paymentType);
    }
}
