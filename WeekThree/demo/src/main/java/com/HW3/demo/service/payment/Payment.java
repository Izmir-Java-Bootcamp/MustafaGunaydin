package com.HW3.demo.service.payment;

import com.HW3.demo.checkout.Bill;
import com.HW3.demo.enums.PaymentType;

public interface Payment {
    void pay(Bill bill);
    PaymentType getType();
}
