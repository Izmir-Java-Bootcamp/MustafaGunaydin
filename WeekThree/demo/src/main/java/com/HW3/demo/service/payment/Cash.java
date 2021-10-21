package com.HW3.demo.service.payment;

import com.HW3.demo.checkout.Bill;
import com.HW3.demo.enums.PaymentType;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cash implements Payment {

    @Override
    public void pay(Bill bill){
        System.out.println("Payment completed with cash your total price : "+bill.getTotalPrice());
    }

    @Override
    public PaymentType getType(){
        return PaymentType.WCASH;
    }

}

