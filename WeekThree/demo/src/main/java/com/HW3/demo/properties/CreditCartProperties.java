package com.HW3.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="credit-cart")

public class CreditCartProperties {
	private double commission;

}
