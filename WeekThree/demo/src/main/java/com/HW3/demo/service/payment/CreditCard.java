package com.HW3.demo.service.payment;

import com.HW3.demo.checkout.Bill;
import com.HW3.demo.enums.PaymentType;
import com.HW3.demo.properties.CreditCartProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "discount")
@Data
public class CreditCard implements Payment{
    private CreditCartProperties creditCartProperties;

    @Override
    public void pay(Bill bill){
        double creditCardCommision = creditCartProperties.getCommission();
        double commission = bill.getTotalPrice()*(creditCardCommision*0.01);
        double price = bill.getTotalPrice()+commission;

        System.out.println("Credit Cart payment completed Commission charge :"
                + commission + " Commission Rate : "+ creditCardCommision +
                " Payment after Commission "+ price);
    }

    @Override
    public PaymentType getType(){
        return PaymentType.WCARD;
    }
}
