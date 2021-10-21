package com.HW3.demo.checkout;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Bill {
    private List<BillItem> billItems;
    private double totalPrice;
}
