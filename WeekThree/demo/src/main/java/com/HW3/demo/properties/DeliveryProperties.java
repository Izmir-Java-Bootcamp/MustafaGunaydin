package com.HW3.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="delivery")
public class DeliveryProperties {
	private int fee;
	private int feeLimit;

}
